# Smart Parking & EV Charging System

## Project Overview

This project is a **console-based Smart Parking System** developed in **Java** using **Object-Oriented Programming (OOP)** concepts.
It simulates a real-life parking management system where users can park vehicles, calculate parking fees, and manage parking slots efficiently.

---

## Project Objectives

* Implement the **4 Pillars of OOP** in a real-world application
* Develop a **menu-driven Java program**
* Design a **modular and scalable system using packages**
* Demonstrate clean coding and class-based architecture

---

## Key Features

*  Park vehicles (Car, Bike, Electric Car)
*  Automatic parking time tracking
*  Dynamic charge calculation system
*  Live parking status display
*  Slot limit control (No overbooking)
*  Demo vehicle generator for testing

---

## OOP Concepts Implementation

### Encapsulation

* Private data members in `Vehicle` class
* Access controlled using getter methods

### Abstraction

* `Vehicle` is an abstract class
* Defines common structure without implementation

### Inheritance

* `Car`, `Bike`, and `ElectricCar` extend `Vehicle`

###  Polymorphism

* `calculateCharge()` method overridden in each subclass

---
## Sample Output

```
===== SMART PARKING SYSTEM =====
1. Park Vehicle
2. Checkout Vehicle
3. Show Parking Status
4. Add Demo Vehicles
5. Exit
Choose option: 1

Enter vehicle number: DHAKA-1234
Enter owner name: Rahim
Enter type (car/bike/ev): car
Car parked.

===== SMART PARKING SYSTEM =====
Choose option: 3

Total: 5 | Occupied: 1
Car - DHAKA-1234

===== SMART PARKING SYSTEM =====
Choose option: 2

Enter number: DHAKA-1234

--- Checkout Details ---
Vehicle Type : Car
Number       : DHAKA-1234
Owner        : Rahim
Time         : 2 minute(s)
Charge       : Tk 90.0

Checkout completed.

===== SMART PARKING SYSTEM =====
Choose option: 5

Program closed.
```

---


## Project Structure

```bash
SmartParkingSystem/
│
├── Main.java
├── README.md
├── LICENSE
├── .gitignore
│
├── models/
│   ├── Vehicle.java
│   ├── Car.java
│   ├── Bike.java
│   └── ElectricCar.java
│
└── manager/
    └── ParkingManager.java
```

---

##  How to Run

### Step 1: Compile

```bash
javac Main.java models/*.java manager/*.java
```

###  Step 2: Run

```bash
java Main
```

---

##  System Menu

```
===== SMART PARKING SYSTEM =====
1. Park Vehicle
2. Checkout Vehicle
3. Show Parking Status
4. Add Demo Vehicles
5. Exit
```

---

## System Workflow

1. User selects an option from the menu
2. System creates object based on vehicle type
3. Vehicle stored in ParkingManager
4. Checkout calculates time & parking fee
5. Status shows current parked vehicles

---


##  Real-Life Applications

* Shopping mall parking systems 
* Airport parking management 
* Smart city infrastructure
* Office parking automation 

---

##  Future Enhancements

* GUI version (JavaFX / Swing)
* Database integration (MySQL)
* Online slot booking system
* Payment gateway integration
* Receipt generation system

---

##  Author

**Md. Safatul Islam**
Java OOP Academic Project

---

##  License

This project is licensed under the **MIT License**.

---

##  Conclusion

This project demonstrates how **Object-Oriented Programming** can be used to design a **real-world smart parking system** efficiently, maintaining clean architecture and scalability.

---
