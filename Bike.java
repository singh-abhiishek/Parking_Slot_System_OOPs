
class Bike extends Vehicle {

    public Bike(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double calculateFee(long hours) {
        return hours * 10; // ₹10 per hour
    }

    @Override
    public String getVehicleType() {
        return "Bike";
    }
}
