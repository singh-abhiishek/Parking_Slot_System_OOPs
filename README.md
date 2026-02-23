
---

# Parking Slot Booking System (Java OOP)

A console-based Parking Slot Booking System built using **Core Java** and **Object-Oriented Programming (OOP)** principles.

This project simulates real-world parking lot operations such as vehicle entry, slot allocation.

---

## Features

* Park Vehicle (Car / Bike)
* Remove Vehicle
* Show Available Slots
* Show Occupied Slots
* Menu-Driven Console Application

---

## OOP Concepts Implemented

* **Abstraction** → `Vehicle` abstract class
* **Inheritance** → `Car` and `Bike` extend `Vehicle`
* **Polymorphism** → Dynamic fee calculation using overridden methods
* **Encapsulation** → Private fields with controlled access


---

## 📂 Project Structure

```
ParkingSlotBookingSystem/
│
├── src/                         # Source code
│   ├── Main.java
│   ├── Vehicle.java
│   ├── Car.java
│   ├── Bike.java
│   ├── ParkingLot.java
│   └── ParkingSlot.java
│
├── bin/                         # Compiled .class files (auto-generated)
│
├── .gitignore                   # Ignores compiled files
│
└── README.md                    # Project documentation
```

---

## How to Run (Professional Setup Recommended)

### 🔹 1. Compile Source Files into `bin` Folder

```bash
javac -d bin src/*.java
```

### 🔹 2. Run the Application

```bash
java -cp bin Main
```

---

## Clean Compiled Files (Optional)

If you want to delete compiled `.class` files:

```bash
rm -rf bin/*
```

```

---

## Fee Structure

| Vehicle Type | Rate         |
| ------------ | ------------ |
| 🚗 Car       | ₹20 per hour |
| 🏍️ Bike     | ₹10 per hour |

---

## Learning Outcomes

This project demonstrates:

* Real-world object modeling
* Clean class responsibility design
* Practical use of OOP principles
* Command-line application development

---

## Author

**Abhishek Singh**
Java OOP Practice Project

---
