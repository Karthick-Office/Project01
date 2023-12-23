package PS5;
import java.util.*;
import java.util.stream.Collectors;

class Person {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
}

public class StreamExample {
    public static void main(String[] args) {
        // Task 1: Print all persons using Streams and Method Reference
        Set<Person> persons = new HashSet<>();
        persons.add(new Person(4, "Jones", 22, 6999.0));
        persons.add(new Person(6, "Tom", 42, 3999.0));
        persons.add(new Person(1, "Jerry", 12, 999.0));
        persons.add(new Person(5, "John", 32, 1999.0));
        persons.add(new Person(2, "Smith", 22, 2999.0));
        persons.add(new Person(3, "Popeye", 21, 5999.0));

        // Task 1
        System.out.println("--Print all the person records--");
        persons.stream().forEach(System.out::println);

        // Task 2: Print all persons sorted by id in ascending order
        System.out.println("\n--Sorted Asc Id--");
        persons.stream()
                .sorted(Comparator.comparingInt(Person::getId))
                .forEach(System.out::println);

        // Task 3: Print all persons sorted by name in ascending order
        System.out.println("\n--Sorted Asc Name--");
        persons.stream()
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);

        // Task 4: Print all persons sorted by name in descending order
        System.out.println("\n--Sorted Desc Name--");
        persons.stream()
                .sorted(Comparator.comparing(Person::getName).reversed())
                .forEach(System.out::println);

        // Task 5: Print persons whose name starts with 'J'
        System.out.println("\n--Name start with J--");
        persons.stream()
                .filter(p -> p.getName().startsWith("J"))
                .forEach(System.out::println);

        // Task 6: Print the count of persons
        System.out.println("\n--Count number of persons--");
        System.out.println(persons.stream().count());

        // Task 7: Print the Max salary among all persons
        System.out.println("\n--Max salary among all persons " + persons.stream()
                .mapToDouble(Person::getSalary)
                .max()
                .orElse(Double.NaN));

        // Task 8: Print the Min salary among all persons
        System.out.println("\n--Min salary among all persons " + persons.stream()
                .mapToDouble(Person::getSalary)
                .min()
                .orElse(Double.NaN));

        // Task 9: Print the average of all salaries
        System.out.println("\n--Average of salaries--");
        System.out.println(persons.stream()
                .mapToDouble(Person::getSalary)
                .average()
                .orElse(Double.NaN));

        // Task 10: Print the sum of all salaries
        System.out.println("\n--Sum of all salaries--");
        System.out.println(persons.stream()
                .mapToDouble(Person::getSalary)
                .sum());

        // Task 11: Print the first person whose name starts with 'J'
        System.out.println("\n--First Person whose Name start with J--");
        System.out.println(persons.stream()
                .filter(p -> p.getName().startsWith("J"))
                .findFirst()
                .orElse(null));

        // Task 12: Check whether all persons' age is greater than 10
        System.out.println("\n--Return true if All person age greater than 10--");
        System.out.println(persons.stream().allMatch(p -> p.getAge() > 10));

        // Task 13: Check whether all persons' age is greater than 50
        System.out.println("\n--Return true if All person age greater than 50--");
        System.out.println(persons.stream().noneMatch(p -> p.getAge() > 50));

        // Task 14: Print the average of all salaries using Collectors
        System.out.println("\n--Average salaries to Double--");
        System.out.println(persons.stream()
                .collect(Collectors.averagingDouble(Person::getSalary)));

        // Task 15: Print all persons details grouped by salary using Collectors
        System.out.println("\n--Group By Salary--");
        Map<Double, List<Person>> groupedBySalary = persons.stream()
                .collect(Collectors.groupingBy(Person::getSalary));
        groupedBySalary.forEach((salary, people) -> {
            System.out.println("Person Grouped By: " + salary);
            people.forEach(System.out::println);
        });

        // Task 16: Join all names whose age is greater than 18
        System.out.println("\n--Joining all the names whose age is greater than 18--");
        String joinedNames = persons.stream()
                .filter(p -> p.getAge() > 18)
                .map(Person::getName)
                .collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));
        System.out.println(joinedNames);

        // Task 17: Print Min, Max, Count, Average, and Sum of all persons using Statistics
        System.out.println("\n--Statistics object--");
        DoubleSummaryStatistics statistics = persons.stream()
                .collect(Collectors.summarizingDouble(Person::getSalary));
        System.out.println("Count is: " + statistics.getCount());
        System.out.println("Average is: " + statistics.getAverage());
        System.out.println("Sum is: " + statistics.getSum());
        System.out.println("Minimum is: " + statistics.getMin());
        System.out.println("Maximum is: " + statistics.getMax());

        // Task 18: Determine the oldest person using Reduce
        System.out.println("\n--Determine the oldest person--");
        persons.stream()
                .reduce((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2)
                .ifPresent(System.out::println);

        // Task 19: Add n number of multiple records and print the time taken sequentially
        int n = 100000;
        List<Person> manyPersons = new ArrayList<>();
        // Add n Person details to manyPersons
        for (int i = 0; i < n; i++) {
            manyPersons.add(new Person(i, "Name" + i, 25, 5000.0));
        }

        System.out.println("\n--Time taken with Sequential--");
        long startTimeSeq = System.currentTimeMillis();
        manyPersons.stream().forEach(p -> {});
        long endTimeSeq = System.currentTimeMillis();
        System.out.println("Time taken with Sequential: " + (endTimeSeq - startTimeSeq));

        // Task 20: Print the time taken with parallel using parallelStream
        System.out.println("\n--Time taken with parallel--");
        long startTimeParallel = System.currentTimeMillis();
        manyPersons.parallelStream().forEach(p -> {});
        long endTimeParallel = System.currentTimeMillis();
        System.out.println("Time taken with Parallel: " + (endTimeParallel - startTimeParallel));
    }
}
