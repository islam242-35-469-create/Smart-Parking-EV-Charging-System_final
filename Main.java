import java.util.*;
import manager.ParkingManager;
import models.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParkingManager manager = new ParkingManager("Smart City Parking", 5);

        while (true) {
            System.out.println("\n===== SMART PARKING SYSTEM =====");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Checkout Vehicle");
            System.out.println("3. Show Parking Status");
            System.out.println("4. Add Demo Vehicles");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter vehicle number: ");
                    String number = sc.nextLine();

                    System.out.print("Enter owner name: ");
                    String owner = sc.nextLine();

                    System.out.print("Enter type (car/bike/ev): ");
                    String type = sc.nextLine();

                    Vehicle v = switch (type) {
                        case "car" -> new Car(number, owner);
                        case "bike" -> new Bike(number, owner);
                        default -> new ElectricCar(number, owner);
                    };

                    manager.parkVehicle(v);
                }

                case 2 -> {
                    System.out.print("Enter number: ");
                    manager.checkoutVehicle(sc.nextLine());
                }

                case 3 -> manager.showStatus();

                case 4 -> {
                    manager.parkVehicle(new Car("DHAKA-1001", "Sajid"));
                    manager.parkVehicle(new Bike("DHAKA-2002", "Rahim"));
                    manager.parkVehicle(new ElectricCar("DHAKA-3003", "Nadia"));
                }

                case 5 -> {
                    sc.close();
                    System.exit(0);
                }
            }
        }
    }
}