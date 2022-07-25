package planeTest;

import org.junit.Before;
import org.junit.Test;
import plane.Plane;
import plane.PlaneType;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUS_A380);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.AIRBUS_A380, plane.getPlaneType());
    }

    @Test
    public void canGetPlaneCapacity(){
        assertEquals(509, plane.getCapacityFromPlaneType());
    }

    @Test
    public void canGetPlaneWeight(){
        assertEquals(391000, plane.getWeightFromPlaneType());
    }

}
