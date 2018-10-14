public class Plane {
    private PlaneType type;
    private AirlineType airline;

    public Plane(PlaneType type, AirlineType airline) {
       this.type = type;
       this.airline = airline;
    }

    public PlaneType getType() {
        return this.type;
    }

    public AirlineType getAirline() {
       return this.airline;
    }
}
