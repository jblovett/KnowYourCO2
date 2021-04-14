
public class VehicleFactory {
    public Vehicle create(VehicleType type, int passengers){
        switch (type) {
            case SUV:
                if (passengers > 9 || passengers < 1) {
                    throw new IllegalArgumentException("No SUV can hold more than nine people.");
                }
                return new NineSeaterSUV(passengers);

            case HYBRID:
                if (passengers > 4 || passengers < 1) {
                    throw new IllegalArgumentException("Hybrid SUVs will be added in next week's patch!");
                }
                return new Hybrid(passengers);


            case BICYCLE:
                if (passengers > 1 || passengers < 1) {
                    throw new IllegalArgumentException("OK, you try biking anywhere with someone on your back. It ain't fun.");
                }
                return new GreenVehicle(type);


            case AIRPLANE:
                if (passengers > 853 || passengers < 1) {
                    throw new IllegalArgumentException("A bigger airplane hasn't been invented yet.");
                }
                return new Airplane(passengers);


            case MOTORCYCLE:
                if (passengers > 2 || passengers < 1){
                    throw new IllegalArgumentException("Can't fit more than two on a motorcycle");

                }
                return new Motorcycle(passengers);

            case TWO_SEATER_PICKUP:
                if (passengers > 2 || passengers < 1) {
                    throw new IllegalArgumentException("please don't ride in the pickup");
                }
                return new TwoSeaterPickup(passengers);

            default:
                throw new IllegalArgumentException("Please provide a valid vehicle");


        }

    }
}
