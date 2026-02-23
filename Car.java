
class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double calculateFee(long hours) {
        return hours * 20; // ₹20 per hour
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }
}
