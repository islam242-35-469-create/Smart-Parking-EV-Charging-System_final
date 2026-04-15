package models;

public class Bike extends Vehicle {
    public Bike(String n, String o) {
        super(n, o);
    }

    public double calculateCharge(long m) {
        return 20 + Math.ceil(m/60.0)*15;
    }

    public String getVehicleType() {
        return "Bike";
    }
}