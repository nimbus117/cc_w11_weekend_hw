import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class AirportTest {
   Plane plane1;
   Airport airport;

   @Before
   public void before() {
      plane1 = new Plane(PlaneType.BOEING737, AirlineType.BA);
      airport = new Airport(CodeType.EDI);
   }

   @Test
   public void canAddPlaneToHanger() {
      airport.addPlaneToHanger(plane1);
      assertEquals(1, airport.getHangerCount());
   }

   @Test
   public void canCreateFlight() {
      Flight flight = airport.createFlight(321, CodeType.MCT);
      assertEquals(321, flight.getNumber());
   }

   @Test
   public void canAssignPlaneToFlight() {
      Flight flight = airport.createFlight(321, CodeType.MCT);
      airport.addPlaneToHanger(plane1);
      airport.assignPlaneToFlight(plane1, flight);
      assertEquals(plane1, flight.getPlane());
   }

   @Test
   public void cannotAssignPlaneToFlight() {
      Flight flight = airport.createFlight(321, CodeType.MCT);
      airport.assignPlaneToFlight(plane1, flight);
      assertNull(flight.getPlane());
   }

   @Test
   public void canAddPassengerToFlight() {
      Flight flight = airport.createFlight(321, CodeType.MCT);
      Passenger passenger = new Passenger("Bob");
      airport.addPassengerToFlight(passenger, flight);
      assertEquals(1, flight.getPassengerCount());
   }
}
