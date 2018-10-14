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

   @Test
   public void canGetPassengersPerFlight() {
      Flight flight1 = airport.createFlight(321, CodeType.MCT);
      Flight flight2 = airport.createFlight(422, CodeType.LGW);
      Passenger passenger1 = new Passenger("Bob");
      Passenger passenger2 = new Passenger("Betty");
      Passenger passenger3 = new Passenger("Frank");
      airport.addPassengerToFlight(passenger1, flight1);
      airport.addPassengerToFlight(passenger2, flight1);
      airport.addPassengerToFlight(passenger3, flight2);
      assertEquals(2, airport.getPassengersPerFlight().get(321));
      assertEquals(1, airport.getPassengersPerFlight().get(422));
   }

   @Test
   public void wontAddPassengerToFullFlight() {
      Flight flight1 = airport.createFlight(321, CodeType.MCT);
      airport.addPlaneToHanger(plane1);
      airport.assignPlaneToFlight(plane1, flight1);
      Passenger passenger1 = new Passenger("Bob");
      Passenger passenger2 = new Passenger("Betty");
      Passenger passenger3 = new Passenger("Frank");
      airport.addPassengerToFlight(passenger1, flight1);
      airport.addPassengerToFlight(passenger2, flight1);
      airport.addPassengerToFlight(passenger3, flight1);
      assertEquals(2, flight1.getPassengerCount());
   }
}
