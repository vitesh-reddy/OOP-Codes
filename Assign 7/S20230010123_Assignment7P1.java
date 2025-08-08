import java.util.*;

abstract class Vehicle {
    public abstract String getDescription();

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.getDescription() + " is being garbage collected.");
        super.finalize();
    }

    public int displayType() {
        System.out.println("\nThis is a vehicle.");
        return 0;
    }

}

class Truck extends Vehicle {
    private double loadCapacity;

    @Override
    public int displayType() {
        System.out.println("\nVehicle is Truck");
        return 0;
    }

    private double getLoadCapacity() {
        return loadCapacity;
    }

    public Truck(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String getDescription() {
        double lc = getLoadCapacity();
        return "Truck has " + lc + " tons Load Capacity";
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    private int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public int displayType() {
        System.out.println("\nThe vehilce is a car.");
        return 0;
    }

    public Car(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getDescription() {
        int n = numberOfDoors;
        return "The car is having " + n + " Doors";
    }
}

class VehicleManagementSystem {
    static void vms(int noofDoors, double loadCap) {

        Vehicle truck = new Truck(loadCap);
        truck.displayType();
        System.out.println(truck.getDescription());
        truck = null;
        System.gc();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Vehicle car = new Car(noofDoors);
        car.displayType();
        System.out.println(car.getDescription());
        car = null;

        System.gc();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class S20230010123_Assignment7P1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.printf("\nEnter No Doors of car: ");
        int doorsCnt = cin.nextInt();

        System.out.printf("Enter Load Capacity of Truck: ");
        double loadCap = cin.nextDouble();

        VehicleManagementSystem.vms(doorsCnt, loadCap);
        cin.close();
    }
}