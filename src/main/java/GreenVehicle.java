public class GreenVehicle implements Vehicle {
    String vehicle;
    VehicleType type;
    int passengers;

  public GreenVehicle(VehicleType type) {
    switch (type) {
      case BICYCLE:
        vehicle = "Bicycle";
        passengers = 1;
    }
  }

    @Override
    public String getVehicle(){
        return vehicle;
    }

    @Override
    public int getPassengers() {
        return 1;
    }

    @Override
    public double getMPGPerPassenger() {
        return 0;
    }

    @Override
    public double getMPG() {
        return 0;
    }



    @Override
    public void setPassengers(int passengers) {
      switch (type) {
          case BICYCLE:
              if (passengers > 1 || passengers < 0) {
                  throw new IllegalArgumentException();
              }
              this.passengers = passengers;
          default: {
              this.passengers = 1;
          }
      }


    }
}
