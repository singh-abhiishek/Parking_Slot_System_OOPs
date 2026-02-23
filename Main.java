
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of parking slots: ");
        int totalSlots = sc.nextInt();

        ParkingLot parkingLot = new ParkingLot(totalSlots);

        while (true) {
            System.out.println("\n===== Parking Menu =====");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Show Available Slots");
            System.out.println("4. Show Occupied Slots");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter vehicle type (Car/Bike): ");
                    String type = sc.nextLine();

                    System.out.print("Enter vehicle number: ");
                    String number = sc.nextLine();

                    Vehicle vehicle;

                    if (type.equalsIgnoreCase("Car")) {
                        vehicle = new Car(number);
                    } else {
                        vehicle = new Bike(number);
                    }

                    parkingLot.parkVehicle(vehicle);
                    break;

                case 2:
                    System.out.print("Enter vehicle number to remove: ");
                    String removeNumber = sc.nextLine();
                    parkingLot.removeVehicle(removeNumber);
                    break;

                case 3:
                    parkingLot.showAvailableSlots();
                    break;

                case 4:
                    parkingLot.showOccupiedSlots();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
