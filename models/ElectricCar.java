package models;

public class ElectricCar extends Vehicle {
    public ElectricCar(String n, String o) {
        super(n, o);
    }

    public double calculateCharge(long m) {
        return 80 + Math.ceil(m/60.0)*30;
    }

    public String getVehicleType() {
        return "Electric Car";
    }
}