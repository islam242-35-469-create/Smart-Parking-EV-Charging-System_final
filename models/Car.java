package models;

public class Car extends Vehicle {
    public Car(String n, String o) {
        super(n, o);
    }

    public double calculateCharge(long m) {
        return 50 + Math.ceil(m/60.0)*40;
    }

    public String getVehicleType() {
        return "Car";
    }
}