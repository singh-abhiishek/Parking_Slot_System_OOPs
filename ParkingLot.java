
import java.util.*;

class ParkingLot {

    private List<ParkingSlot> slots;

    public ParkingLot(int totalSlots) {
        slots = new ArrayList<>();
        for (int i = 1; i <= totalSlots; i++) {
            slots.add(new ParkingSlot(i));
        }
    }

    public void parkVehicle(Vehicle vehicle) {
        for (ParkingSlot slot : slots) {
            if (slot.isAvailable()) {
                slot.parkVehicle(vehicle);
                System.out.println("Vehicle parked at slot: " + slot.getSlotNumber());
                return;
            }
        }
        System.out.println("Parking Lot is Full!");
    }

    public void removeVehicle(String vehicleNumber) {
        for (ParkingSlot slot : slots) {
            if (!slot.isAvailable() &&
                slot.getVehicle().getVehicleNumber().equals(vehicleNumber)) {

                Vehicle vehicle = slot.removeVehicle();
                long exitTime = System.currentTimeMillis();
                long hours = Math.max(1, (exitTime - vehicle.getEntryTime()) / (1000 * 60 * 60));
                double fee = vehicle.calculateFee(hours);

                System.out.println("Vehicle removed from slot: " + slot.getSlotNumber());
                System.out.println("Total Hours: " + hours);
                System.out.println("Total Fee: ₹" + fee);
                return;
            }
        }
        System.out.println("Vehicle not found!");
    }

    public void showAvailableSlots() {
        System.out.println("Available Slots:");
        for (ParkingSlot slot : slots) {
            if (slot.isAvailable()) {
                System.out.println("Slot " + slot.getSlotNumber());
            }
        }
    }

    public void showOccupiedSlots() {
        System.out.println("Occupied Slots:");
        for (ParkingSlot slot : slots) {
            if (!slot.isAvailable()) {
                System.out.println("Slot " + slot.getSlotNumber() +
                        " → " + slot.getVehicle().getVehicleNumber());
            }
        }
    }
}
