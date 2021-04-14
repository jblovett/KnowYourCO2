public class DirectionImpl implements Direction{
    Vehicle vehicle;
    double distance;
    Topography topography;

    public DirectionImpl(Vehicle v, double distance, Topography topo) {
        if (v == null || distance <= 0 || topo == null) {
            throw new IllegalArgumentException();
        }

        vehicle = v;
        this.distance = distance;
        topography = topo;
    }


    @Override
    public double getDistance() {
        return distance;
    }

    @Override
    public Vehicle getVehicle() {
        return vehicle;
    }

    @Override
    public int getPassengers() {
        return vehicle.getPassengers();
    }

    @Override
    public Topography getTopography() {
        return topography;
    }

    @Override
    public double getCO2() {
        double mpg = vehicle.getMPG();
        double CO2_kg_per_gallon = 8.89;
        return CO2_kg_per_gallon * mpg * getDistance();

    }

    @Override
    public double getEmissionsPerPassenger() {
        return getCO2()/getPassengers();
    }
}
