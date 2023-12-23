package PS4;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

class Person implements Comparable<Person> {
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

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
        return id == person.id;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Set<Person> personSet = new TreeSet<>();
        personSet.add(new Person(1, "Jerry", 12, 999.0));
        personSet.add(new Person(2, "Smith", 22, 2999.0));
        personSet.add(new Person(3, "Popeye", 21, 5999.0));
        personSet.add(new Person(4, "Jones", 22, 6999.0));
        personSet.add(new Person(5, "John", 32, 1999.0));
        personSet.add(new Person(6, "Tom", 42, 3999.0));


        System.out.println("--Sorted Asc by Id--");
        personSet.forEach(System.out::println);


        System.out.println("\n--Sorted Asc Name--");
        personSet.stream().sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);

      
        System.out.println("\n--Sorted Desc Name--");
        personSet.stream().sorted(Comparator.comparing(Person::getName, Comparator.reverseOrder())).forEach(System.out::println);

    
        System.out.println("\n--age is greater than 25--");
        personSet.stream().filter(person -> person.getAge() > 25).forEach(System.out::println);


        System.out.println("\n--print id, name, and salary--");
        personSet.forEach(person -> {
            Consumer<Person> consumer = System.out::println;
            consumer.accept(person);
        });

        System.out.println("\n--all the names in uppercase--");
        personSet.stream().map(Person::getName).map(String::toUpperCase).forEach(System.out::println);

        System.out.println("\n--applying appraisal to salary--");
        ToDoubleFunction<Person> appraisalFunction = person -> person.getSalary() * 1.1;
        personSet.forEach(person -> System.out.println("Name is: " + person.getName() + " and Salary is: " + appraisalFunction.applyAsDouble(person)));

        System.out.println("\n--print id, name, and salary--");
        Consumer<Person> printDetails = person -> System.out.println(person.getId() + "\n" + person.getName() + " " + person.getSalary());
        personSet.forEach(printDetails);

   
        System.out.println("\n--all the names in uppercase--");
        Function<Person, String> toUpperCase = person -> person.getName().toUpperCase();
        personSet.stream().map(toUpperCase).forEach(System.out::println);

        System.out.println("\n--applying appraisal to salary--");
        ToDoubleFunction<Person> appraisalFunction1 = person -> person.getSalary() * 1.1;
        personSet.forEach(person -> System.out.println("Name is: " + person.getName() + " and Salary is: " + appraisalFunction1.applyAsDouble(person)));
    
    }
}
