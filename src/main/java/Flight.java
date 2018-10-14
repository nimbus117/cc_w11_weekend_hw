import java.util.ArrayList;

public class Flight {
    private Plane plane;
    private int number;
    private String destination;
    private ArrayList<Passenger> passengers;

    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
        this.passengers = new ArrayList<>();
    }

    public int getNumber() {
        return this.number;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getDestination() {
        return this.destination;
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public int getPassengerCount() {
        return passengers.size();
    }
}
