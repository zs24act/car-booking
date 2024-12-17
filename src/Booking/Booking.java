package Booking;

public class Booking {
    private int userId;
    private int carId;

    public Booking(int userId, int carId) {
        this.userId = userId;
        this.carId = carId;
    }

    public int getUserId() {
        return userId;
    }

    public int getCarId() {
        return carId;
    }

    @Override
    public String toString() {
        return "Booking -> User ID: " + userId + ", Car ID: " + carId;
    }
}

