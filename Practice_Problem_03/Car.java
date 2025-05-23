package Practice_Problem_03;

public class Car {
    // Attributes (instance variables)
    private String owner;
    private String brand;
    private String serialNumber;
    private boolean isRunning;
    private double fuelLevel;


    public Car(String owner, String brand, String serialNumber, double fuelLevel) {
        this.owner = owner;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuelLevel = fuelLevel;
        this.isRunning = false;
    }


    public void start() {
        if (fuelLevel > 0) {
            isRunning = true;
            System.out.println("Car started.");
        } else {
            System.out.println("Cannot start car. Fuel is empty.");
        }
    }

    public void stop() {
        isRunning = false;
        System.out.println("Car stopped.");
    }


    public void checkFuel() {
        System.out.println("Fuel level: " + fuelLevel + " liters.");
    }


    public void displayInfo() {
        System.out.println("Owner: " + owner);
        System.out.println("Brand: " + brand);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Running: " + (isRunning ? "Yes" : "No"));
        System.out.println("Fuel Level: " + fuelLevel + " liters");
    }
}

