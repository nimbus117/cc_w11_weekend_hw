import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PassengerTest {

   @Test
   public void hasName() {
      Passenger passenger = new Passenger("Pat");
      assertEquals("Pat", passenger.getName());
   }
}
