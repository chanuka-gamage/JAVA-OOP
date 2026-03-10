import java.util.Scanner;

// --- 1. Abstract Base Class ---
abstract class Vehicle {
    private int vid;
    private int year;
    private String model;
    private double rentalRate;
    private double mileageRate;

    public Vehicle(int vid, int year, String model, double rentalRate, double mileageRate) {
        this.vid = vid;
        this.year = year;
        this.model = model;
        this.rentalRate = rentalRate;
        this.mileageRate = mileageRate;
    }

    // Getters for subclasses to access private attributes
    public int getVid() { return vid; }
    public int getYear() { return year; }
    public String getModel() { return model; }
    public double getRentalRate() { return rentalRate; }
    public double getMileageRate() { return mileageRate; }

    public abstract double calculateRentalCost(int days, int miles);
    public abstract void getVehicleDetails();
}

// --- 2. Subclasses ---

class Car extends Vehicle {
    public Car(int vid, int year, String model, double rentalRate, double mileageRate) {
        super(vid, year, model, rentalRate, mileageRate);
    }

    @Override
    public double calculateRentalCost(int days, int miles) {
        double baseCost = getRentalRate() * days;
        double mileageCost = getMileageRate() * miles;
        return baseCost + mileageCost;
    }

    @Override
    public void getVehicleDetails() {
        System.out.println("Type: Car | ID: " + getVid() + " | Model: " + getModel() + " [" + getYear() + "]");
    }
}

class Truck extends Vehicle {
    public Truck(int vid, int year, String model, double rentalRate, double mileageRate) {
        super(vid, year, model, rentalRate, mileageRate);
    }

    @Override
    public double calculateRentalCost(int days, int miles) {
        // Basecost = rentalrate * days * 10% (surcharge)
        double baseCost = (getRentalRate() * days) * 1.10;
        // Mileagecost = mileagerate * miles * 15% (Higher mileage)
        double mileageCost = (getMileageRate() * miles) * 1.15;
        return baseCost + mileageCost;
    }

    @Override
    public void getVehicleDetails() {
        System.out.println("Type: Truck | ID: " + getVid() + " | Model: " + getModel() + " [" + getYear() + "]");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(int vid, int year, String model, double rentalRate, double mileageRate) {
        super(vid, year, model, rentalRate, mileageRate);
    }

    @Override
    public double calculateRentalCost(int days, int miles) {
        double baseCost = getRentalRate() * days;
        // If rented more than 7 days, add 20% discount
        if (days > 7) {
            baseCost = baseCost * 0.80;
        }
        // Give 10% discount with Mileagecost
        double mileageCost = (getMileageRate() * miles) * 0.90;
        return baseCost + mileageCost;
    }

    @Override
    public void getVehicleDetails() {
        System.out.println("Type: Motorcycle | ID: " + getVid() + " | Model: " + getModel() + " [" + getYear() + "]");
    }
}

// --- 3. Main System Class ---

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Vehicle Rental System ---");
        System.out.println("Select Vehicle Type: 1. Car | 2. Truck | 3. Motorcycle");
        int type = sc.nextInt();

        System.out.print("Enter Rental Days: ");
        int days = sc.nextInt();
        System.out.print("Enter Expected Miles: ");
        int miles = sc.nextInt();

        Vehicle v = null;

        // Initialize based on choice with sample data
        switch (type) {
            case 1:
                v = new Car(1001, 2023, "Sedan", 40.0, 0.25);
                break;
            case 2:
                v = new Truck(2001, 2021, "Heavy Hauler", 80.0, 0.50);
                break;
            case 3:
                v = new Motorcycle(3001, 2024, "Sport Bike", 25.0, 0.15);
                break;
            default:
                System.out.println("Invalid selection.");
                return;
        }

        // Final Output
        System.out.println("\n--- Final Receipt ---");
        v.getVehicleDetails();
        System.out.printf("Total Calculated Cost: $%.2f\n", v.calculateRentalCost(days, miles));
        System.out.println("----------------------");

        sc.close();
    }
}