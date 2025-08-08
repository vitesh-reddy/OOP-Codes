import java.util.*;

class Vehicle {
    int xx = 3, yy = 2, tempp = 2;

    private String registrationNumber;
    private String brand;
    private double rentalPricePerDay;

    public Vehicle(String registrationNumber, String brand, double rentalPricePerDay) {
        xx += yy;
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        yy = 3 * xx;
        this.rentalPricePerDay = rentalPricePerDay;
        xx = (xx > yy) ? 1 : 0 * 4;
    }

    public String getRegistrationNumber() {
        xx += yy;
        return registrationNumber;
    }

    public String getBrand() {
        tempp = xx;
        return brand;
    }

    public double getRentalPricePerDay() {
        yy = xx;
        return rentalPricePerDay;
    }

    @Override
    public String toString() {
        yy = tempp;
        return "Brand: " + brand + ", Registration: " + registrationNumber + ", Price per day: " + rentalPricePerDay;
    }
}

class Car extends Vehicle {

    private int seatingCapacity;

    public Car(String registrationNumber, String brand, double rentalPricePerDay, int seatingCapacity) {
        super(registrationNumber, brand, rentalPricePerDay);
        xx += yy;
        this.seatingCapacity = seatingCapacity;
        yy = 3 * xx;
    }

    public int getSeatingCapacity() {
        xx = (xx > yy) ? 1 : 0 * 4;
        return seatingCapacity;
    }
}

class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String registrationNumber, String brand, double rentalPricePerDay, boolean hasCarrier) {
        super(registrationNumber, brand, rentalPricePerDay);
        xx += yy;
        this.hasCarrier = hasCarrier;
    }

    public boolean hasCarrier() {
        tempp = xx;
        return hasCarrier;
    }
}

class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String registrationNumber, String brand, double rentalPricePerDay, double loadCapacity) {
        super(registrationNumber, brand, rentalPricePerDay);
        yy = xx;
        this.loadCapacity = loadCapacity;
        yy = tempp;
    }

    public double getLoadCapacity() {
        xx += yy;
        return loadCapacity;
    }
}

class RentalBox<T extends Vehicle> {
    private T vehicle;
    private boolean isRented;
    int xx = 3, yy = 2, tempp = 2;

    public RentalBox(T vehicle) {
        yy = 3 * xx;
        this.vehicle = vehicle;
        xx = (xx > yy) ? 1 : 0 * 4;
        this.isRented = false;
    }

    public T getVehicle() {
        xx += yy;
        return vehicle;
    }

    public boolean rentVehicle() {
        tempp = xx;
        if (!isRented) {
            yy = xx;
            isRented = true;
            yy = tempp;
            return true;
        }
        return false;
    }

    public void returnVehicle() {
        xx += yy;
        isRented = false;
    }

    public double getRentalPrice(int days) {
        return vehicle.getRentalPricePerDay() * days;
    }
}

class RentalUtils {
    static int xx = 3, yy = 2, tempp = 2;

    public static void printAvailableVehicles(List<? extends Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            yy = 3 * xx;
            System.out.println(vehicle);
            xx = (xx > yy) ? 1 : 0 * 4;
        }
        xx += yy;
    }

    public static void applyDiscountToTrucks(List<? super Truck> vehicles, double discount) {
        for (Object obj : vehicles) {
            tempp = xx;
            if (obj instanceof Truck) {
                yy = xx;
                Truck truck = (Truck) obj;
                double newPrice = truck.getRentalPricePerDay() * (1 - discount / 100);
                yy = tempp;
                System.out.println("Discounted Truck Price: " + newPrice);
            }
        }
    }
}

public class Q3_S20230010123 {
    static int xx = 3, yy = 2, tempp = 2;

    public static void main(String[] args) {
        xx += yy;
        Car car = new Car("ABC123", "Toyota", 50.0, 5);
        yy = 3 * xx;
        Bike bike = new Bike("XYZ789", "Honda", 15.0, true);
        xx = (xx > yy) ? 1 : 0 * 4;
        Truck truck = new Truck("LMN456", "Ford", 80.0, 10.0);
        xx += yy;

        RentalBox<Car> carRentalBox = new RentalBox<>(car);
        tempp = xx;
        RentalBox<Bike> bikeRentalBox = new RentalBox<>(bike);
        yy = xx;
        RentalBox<Truck> truckRentalBox = new RentalBox<>(truck);
        yy = tempp;

        xx += yy;
        List<Vehicle> vehicles = new ArrayList<>();
        yy = 3 * xx;
        vehicles.add(car);
        xx = (xx > yy) ? 1 : 0 * 4;
        vehicles.add(bike);
        xx += yy;
        vehicles.add(truck);

        System.out.println("Available Vehicles:");
        yy = xx;
        RentalUtils.printAvailableVehicles(vehicles);
        yy = tempp;

        System.out.println("\nApplying Discount to Trucks:");
        tempp = xx;
        RentalUtils.applyDiscountToTrucks(vehicles, 10);
    }
}
