public interface Vehicle {
    /*
     * Vehicle
     * Represents a vehicle in our system.
     *
     * getVehicle()
     *   Returns the type of vehicle.
     *
     * getPassengers()
     *   Retrieves the number of passengers
     *
     * getMPGPerPassenger()
     *    Calculates the MPG divided by the number of passengers
     *
     * getMPG()
     *    Retrieves the gas economy of the vehicle in the form of miles per gallon.
     *
     * getPosition()
     *    Retrieves the current position of the vehicle.
     *
     * setVehicle()
     *    Choose a vehicle from a list of enums
     *
     * setPassengers()
     *    Specify the number of passengers in the vehicle.
     *    This depends on the vehicle's capacity.
     *
     *
     */

    String getVehicle();

    int getPassengers();

    double getMPGPerPassenger();

    double getMPG();



    void setPassengers(int passengers);
}
