import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING737, AirlineType.BA);
    }

    @Test
    public void hasCapacity() {
        assertEquals(10, plane.getType().getCapacity());
    }

    @Test
    public void hasAirlineName() {
        assertEquals("British Airways", plane.getAirline().getName());
    }
}
