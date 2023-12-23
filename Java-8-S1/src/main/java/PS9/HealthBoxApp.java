package PS9;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HealthBoxApp {
    private static final Map<String, ZonedDateTime> appointments = new HashMap<>();
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;
        do {
            displayMenu();
            System.out.print("Enter an Option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (option) {
                case 1:
                    scheduleAppointment(scanner);
                    break;
                case 2:
                    printAppointmentDetails(scanner);
                    break;
                case 3:
                    rescheduleAppointment(scanner);
                    break;
                case 4:
                    getReminder(scanner);
                    break;
                case 5:
                    cancelAppointment(scanner);
                    break;
                case 6:
                    System.out.println("Exiting Health Box. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }

        } while (option != 6);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n1. Schedule an Appointment.");
        System.out.println("2. Print Appointment Details.");
        System.out.println("3. Reschedule an Appointment.");
        System.out.println("4. Get Reminder.");
        System.out.println("5. Cancel the Appointments.");
        System.out.println("6. Exit.");
    }

    private static void scheduleAppointment(Scanner scanner) {
        System.out.print("\nEnter Date (dd/mm/yyyy): ");
        String dateStr = scanner.nextLine();
        System.out.print("Enter Time (hh:mm): ");
        String timeStr = scanner.nextLine();

        LocalDateTime localDateTime = LocalDateTime.parse(dateStr + " " + timeStr, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        
        ZoneId zoneId = getZoneId(scanner);

        ZonedDateTime appointmentDateTime = ZonedDateTime.of(localDateTime, zoneId);
        appointments.put(formatter.format(appointmentDateTime), appointmentDateTime);

        System.out.println("Successfully Booked");
    }

    private static void printAppointmentDetails(Scanner scanner) {
        System.out.print("\nEnter an Option: ");
        String key = scanner.nextLine();
        ZonedDateTime appointmentDateTime = appointments.get(key);
        if (appointmentDateTime != null) {
            System.out.println(formatter.format(appointmentDateTime) + " " + appointmentDateTime.getZone());
        } else {
            System.out.println("Appointment not found.");
        }
    }

    private static void rescheduleAppointment(Scanner scanner) {
        System.out.print("\nEnter an Option: ");
        String key = scanner.nextLine();
        ZonedDateTime appointmentDateTime = appointments.get(key);
        if (appointmentDateTime != null) {
            System.out.println("Current Appointment Date is: " + formatter.format(appointmentDateTime));

            System.out.print("Kindly Enter Number of Days to be postponed: ");
            int days = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
            System.out.print("Enter the new time in HH:mm: ");
            String newTimeStr = scanner.nextLine();

            ZonedDateTime newAppointmentDateTime = appointmentDateTime.plusDays(days).with(LocalTime.parse(newTimeStr, DateTimeFormatter.ofPattern("HH:mm")));
            appointments.put(formatter.format(newAppointmentDateTime), newAppointmentDateTime);

            System.out.println("Your Appointment has been rescheduled to: " + formatter.format(newAppointmentDateTime));
        } else {
            System.out.println("Appointment not found.");
        }
    }

    private static void getReminder(Scanner scanner) {
        System.out.print("\nEnter an Option: ");
        String key = scanner.nextLine();
        ZonedDateTime appointmentDateTime = appointments.get(key);
        if (appointmentDateTime != null) {
            ZonedDateTime oneDayBefore = appointmentDateTime.minusDays(1);
            System.out.println("Reminder: " + formatter.format(oneDayBefore));
        } else {
            System.out.println("Appointment not found.");
        }
    }

    private static void cancelAppointment(Scanner scanner) {
        System.out.print("\nEnter an Option: ");
        String key = scanner.nextLine();
        ZonedDateTime appointmentDateTime = appointments.get(key);
        if (appointmentDateTime != null) {
            appointments.remove(key);
            System.out.println("Appointment has been cancelled!!");
        } else {
            System.out.println("Appointment not found.");
        }
    }

    private static ZoneId getZoneId(Scanner scanner) {
        System.out.println("\nAvailable Zones are");
        System.out.println("A: America/Anchorage");
        System.out.println("B: Europe/Paris");
        System.out.println("C: Asia/Tokyo");
        System.out.println("D: America/Phoenix");

        System.out.print("Select the Zone: ");
        String zoneCode = scanner.nextLine();

        switch (zoneCode.toUpperCase()) {
            case "A":
                return ZoneId.of("America/Anchorage");
            case "B":
                return ZoneId.of("Europe/Paris");
            case "C":
                return ZoneId.of("Asia/Tokyo");
            case "D":
                return ZoneId.of("America/Phoenix");
            default:
                System.out.println("Invalid Zone. Defaulting to UTC.");
                return ZoneId.of("UTC");
        }
    }
}
