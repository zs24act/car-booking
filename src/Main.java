
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        bookingService service = new bookingService();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n-- Car Booking CLI Menu --");
            System.out.println("1 - Book Car");
            System.out.println("2 - View All User Booked Cars");
            System.out.println("3 - View All Bookings");
            System.out.println("4 - View Available Cars");
            System.out.println("5 - View Available Electric Cars");
            System.out.println("6 - View All Users");
            System.out.println("7 - Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> service.bookCar();
                case 2 -> service.viewUserBookedCars();
                case 3 -> service.viewAllBookings();
                case 4 -> service.viewAvailableCars();
                case 5 -> service.viewAvailableElectricCars();
                case 6 -> service.viewAllUsers();
                case 7 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 7);
        scanner.close();
    }
    }