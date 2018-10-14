import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class FlightTest {

    private Plane plane;
    private Flight flight;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING737, AirlineType.BA);
        flight = new Flight( 123, "Iceland");
    }

    @Test
    public void hasNumber() {
        assertEquals(123, flight.getNumber());
    }

    @Test
    public void hasNoPlane() {
        assertNull(flight.getPlane());
    }

    @Test
    public void canSetPlane() {
        flight.setPlane(plane);
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasDestination() {
        assertEquals("Iceland", flight.getDestination());
    }

    @Test
    public void canAddPassenger() {
        Passenger passenger = new Passenger("Bob");
        flight.addPassenger(passenger);
        assertEquals(1, flight.getPassengerCount());
    }
}
