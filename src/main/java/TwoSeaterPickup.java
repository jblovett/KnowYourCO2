public class TwoSeaterPickup extends GHGVehicle {
    private String vehicle;
    private int passengers;
    private double MPG;

    public TwoSeaterPickup(int passengers) {
        vehicle = "Two-Seater Pickup Truck";
        this.passengers = passengers;
        MPG = 20.0;

    }



    @Override
    public double getMPG() {
        return MPG;
    }



    @Override
    public void setPassengers(int passengers) {
        if (passengers > 2) {
            throw new IllegalArgumentException();
        }
        this.passengers = passengers;
    }
}
