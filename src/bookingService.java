import Car.Car;
import Booking.Booking;
import User.User;

import java.util.Scanner;

public class bookingService {
    private User[] users = new User[10];
    private Car[] cars = new Car[10];
    private Booking[] bookings = new Booking[10];
    private int userCount = 0, carCount = 0, bookingCount = 0;

    private Scanner scanner = new Scanner(System.in);

    public bookingService() {
        // Initialize users
        users[userCount++] = new User(1, "Alice");
        users[userCount++] = new User(2, "Bob");

        // Initialize cars
        cars[carCount++] = new Car(1, "Toyota", false);
        cars[carCount++] = new Car(2, "Tesla Model 3", true);
        cars[carCount++] = new Car(3, "Nissan Leaf", true);
        cars[carCount++] = new Car(4, "Honda Civic", false);
    }

    public void bookCar() {
        System.out.println("\nEnter User ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Car ID to book: ");
        int carId = scanner.nextInt();
        scanner.nextLine();

        User user = findUserById(userId);
        Car car = findCarById(carId);

        if (user == null) {
            System.out.println("User not found!");
            return;
        }

        if (car == null || car.isBooked()) {
            System.out.println("Car not available for booking!");
            return;
        }

        car.setBooked(true);
        bookings[bookingCount++] = new Booking(userId, carId);
        System.out.println("Booking successful for " + user.getName() + " with Car: " + car.getModel());
    }

    public void viewUserBookedCars() {
        System.out.println("\nEnter User ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine();

        for (Booking booking : bookings) {
            if (booking != null && booking.getUserId() == userId) {
                Car car = findCarById(booking.getCarId());
                System.out.println(car);
            }
        }
    }

    public void viewAllBookings() {
        System.out.println("\nAll Bookings:");
        for (Booking booking : bookings) {
            if (booking != null) System.out.println(booking);
        }
    }

    public void viewAvailableCars() {
        System.out.println("\nAvailable Cars:");
        for (Car car : cars) {
            if (car != null && !car.isBooked()) System.out.println(car);
        }
    }

    public void viewAvailableElectricCars() {
        System.out.println("\nAvailable Electric Cars:");
        for (Car car : cars) {
            if (car != null && !car.isBooked() && car.isElectric()) System.out.println(car);
        }
    }

    public void viewAllUsers() {
        System.out.println("\nAll Users:");
        for (User user : users) {
            if (user != null) System.out.println(user);
        }
    }

    private User findUserById(int id) {
        for (User user : users) {
            if (user != null && user.getId() == id) return user;
        }
        return null;
    }

    private Car findCarById(int id) {
        for (Car car : cars) {
            if (car != null && car.getId() == id) return car;
        }
        return null;
    }
}

