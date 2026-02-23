
abstract class Vehicle {
    private String vehicleNumber;
    private long entryTime;

    public Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        this.entryTime = System.currentTimeMillis();
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public abstract double calculateFee(long hours);
    public abstract String getVehicleType();
}
