public class Hybrid extends GHGVehicle{
    String vehicle;
    int passengers;
    double MPG;

    public Hybrid(int passengers){
        super();
        vehicle = "Hybrid";
        this.passengers = passengers;
        MPG = 40;
    }





    @Override
    public void setPassengers(int passengers) {
        if (passengers > 4) {
            throw new IllegalArgumentException();
        }
        this.passengers = passengers;

    }
}
