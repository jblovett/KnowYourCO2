public class Airplane extends GHGVehicle {
    int passengers;
    String vehicle;


    public Airplane(int passengers) {
        this.passengers = passengers;
        vehicle = "Airplane";
        MPG = 67.0;
    }

   



    @Override
    public void setPassengers(int passengers) {
        if (passengers > 853 || passengers < 1) {
            throw new IllegalArgumentException("A bigger airplane hasn't been invented yet.");
        }
        this.passengers = passengers;
    }
}
