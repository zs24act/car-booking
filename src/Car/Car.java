package Car;

public class Car {
    private int id;
    private String model;
    private boolean isElectric;
    private boolean isBooked;

    public Car(int id, String model, boolean isElectric) {
        this.id = id;
        this.model = model;
        this.isElectric = isElectric;
        this.isBooked = false;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    @Override
    public String toString() {
        return "Car ID: " + id + ", Model: " + model + ", Electric: " + isElectric + ", Booked: " + isBooked;
    }
}

