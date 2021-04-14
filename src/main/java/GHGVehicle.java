public abstract class GHGVehicle implements Vehicle{
    String vehicle;
    int passengers;
    double MPG;

    @Override
    public String getVehicle() {
        return vehicle;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }

    @Override
    public double getMPGPerPassenger() {
        return MPG / passengers;
    }

    @Override
    public double getMPG() {
        return 0;
    }

    @Override
    public abstract void setPassengers(int passengers);
}
