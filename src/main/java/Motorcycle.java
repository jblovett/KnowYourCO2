public class Motorcycle extends GHGVehicle {
    String vehicle;
    int passengers;
    double MPG;

    public Motorcycle(int passengers) {
        this.passengers = passengers;
        vehicle = "Motorcycle";
        MPG = 50.0;
    }


    @Override
    public void setPassengers(int passengers) {
        if (passengers > 2){
            throw new IllegalArgumentException();
        }
        this.passengers = passengers;

    }
}
