public class NineSeaterSUV extends GHGVehicle {
    int passengers;
    String name;
    double MPG;


    public NineSeaterSUV(int passengers) {
        MPG = 18.0;
        name = "SUV";
        this.passengers = passengers;
    }





    @Override
    public void setPassengers(int passengers) {
        if (passengers > 9 || passengers < 1) {
            throw new IllegalArgumentException();
        }
        this.passengers = passengers;
    }
}
