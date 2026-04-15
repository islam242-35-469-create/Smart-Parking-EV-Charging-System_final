package manager;

import models.*;
import java.util.*;

public class ParkingManager {
    private String name;
    private int slots;
    private List<Vehicle> list = new ArrayList<>();

    public ParkingManager(String name, int slots) {
        this.name = name;
        this.slots = slots;
    }

    public void parkVehicle(Vehicle v) {
        if (list.size() >= slots) {
            System.out.println("Parking Full!");
            return;
        }
        list.add(v);
        System.out.println(v.getVehicleType() + " parked.");
    }

    public void checkoutVehicle(String num) {
        for (Vehicle v : list) {
            if (v.getNumber().equalsIgnoreCase(num)) {
                long min = (System.currentTimeMillis()-v.getEntryTime())/60000;
                if(min<1) min=1;

                System.out.println("Charge: Tk " + v.calculateCharge(min));
                list.remove(v);
                return;
            }
        }
        System.out.println("Vehicle not found.");
    }

    public void showStatus() {
        System.out.println("\nTotal: " + slots + " | Occupied: " + list.size());
        for (Vehicle v : list) {
            System.out.println(v.getVehicleType() + " - " + v.getNumber());
        }
    }
}