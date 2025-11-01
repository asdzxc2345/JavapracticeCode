import java.util.Scanner;

abstract class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public abstract void displayInfo();
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car: " + getMake() + " " + getModel() + ", Year: " + getYear() + ", Doors: " + numDoors);
    }
}

class Bike extends Vehicle {
    private int sideCar;

    public Bike(String make, String model, int year, int sideCar) {
        super(make, model, year);
        this.sideCar = sideCar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike: " + getMake() + " " + getModel() + ", Year: " + getYear() + ", Sidecar: " + sideCar);
    }
}

class Truck extends Vehicle {
    private double capacity;

    public Truck(String make, String model, int year, double capacity) {
        super(make, model, year);
        this.capacity = capacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck: " + getMake() + " " + getModel() + ", Year: " + getYear() + ", Capacity: " + capacity + " tons");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[3];

        System.out.println("Enter car details:");
        System.out.print("Make: ");
        String carMake = scanner.nextLine();
        System.out.print("Model: ");
        String carModel = scanner.nextLine();
        System.out.print("Year: ");
        int carYear = scanner.nextInt();
        System.out.print("Number of Doors: ");
        int numDoors = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        vehicles[0] = new Car(carMake, carModel, carYear, numDoors);

        System.out.println("Enter bike details:");
        System.out.print("Make: ");
        String bikeMake = scanner.nextLine();
        System.out.print("Model: ");
        String bikeModel = scanner.nextLine();
        System.out.print("Year: ");
        int bikeYear = scanner.nextInt();
        System.out.print("Sidecar (1 for Yes, 0 for No): ");
        int sideCar = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        vehicles[1] = new Bike(bikeMake, bikeModel, bikeYear, sideCar);

        System.out.println("Enter truck details:");
        System.out.print("Make: ");
        String truckMake = scanner.nextLine();
        System.out.print("Model: ");
        String truckModel = scanner.nextLine();
        System.out.print("Year: ");
        int truckYear = scanner.nextInt();
        System.out.print("Capacity (in tons): ");
        double capacity = scanner.nextDouble();

        vehicles[2] = new Truck(truckMake, truckModel, truckYear, capacity);

        scanner.close();

        System.out.println("\nVehicle Details:");
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
} 