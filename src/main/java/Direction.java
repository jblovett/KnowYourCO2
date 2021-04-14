import java.util.logging.Level;

public interface Direction {
    /* Represents a direction for travel

     * getDistance()
     returns the distance from start in miles

     getVehicle()
     returns the vehicle used for the journey

     getPassengers()
     returns the number of passengers in the vehicle

     getTopography()
     returns the topography of the journey. Uses an enum.
     maybe keep subclasses for these in a factory method?

     getEmissions()
     returns the amount of CO2 emitted by the vehicle during the journey,
     which is effected by the topography, distance, vehicle, and number of passengers

     getEmissionsPerPassenger()
     calculates the emissions per passenger.

     setDistance()
     Specifies the distance from start to end.
     In the future, this should use google maps!

     set

     /
     */

    double getDistance();

    Vehicle getVehicle();

    int getPassengers();

    Topography getTopography();

    double getCO2();

    double getEmissionsPerPassenger();

    public enum Topography{
        FLAT,
        HILLY,
        MOUNTAINOUS,
        AIR
    }
}
