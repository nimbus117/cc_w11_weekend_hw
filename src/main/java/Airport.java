import java.util.ArrayList;
import java.util.HashMap;

public class Airport {
    private ArrayList<Plane> hanger;
    private ArrayList<Flight> flights;
    private CodeType code;

    public Airport(CodeType code) {
        this.code = code;
        hanger = new ArrayList<>();
        flights = new ArrayList<>();
    }

    public CodeType getCode() {
        return  code;
    }

    public void addPlaneToHanger(Plane plane) {
        hanger.add(plane);
    }

    public int getHangerCount() {
        return hanger.size();
    }

   public Flight createFlight(int number, CodeType destination) {
       Flight flight = new Flight(number, destination);
       flights.add(flight);
       return flight;
   }

   public void assignPlaneToFlight(Plane plane, Flight flight) {
        if (hanger.remove(plane)) {
            flight.setPlane(plane);
        }
   }

   public void addPassengerToFlight(Passenger passenger, Flight flight) {
       flight.addPassenger(passenger);
   }

   public HashMap getPassengersPerFlight() {
       HashMap<Integer, Integer> flightCount = new HashMap<>();
       for (Flight flight : flights) {
          flightCount.put(flight.getNumber(), flight.getPassengerCount());
       }
       return flightCount;
   }
}
