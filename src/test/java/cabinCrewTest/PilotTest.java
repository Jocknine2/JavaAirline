package cabinCrewTest;

import crew.Pilot;
import crew.RankType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("John", RankType.CAPTAIN, "PL8236501S");
    }

    @Test
    public void canGetPilotName(){
        assertEquals("John", pilot.getName());
    }

    @Test
    public void canGetPilotRank(){
        assertEquals(RankType.CAPTAIN, pilot.getRankType());
    }

    @Test
    public void canGetPilotLicense(){
        assertEquals("PL8236501S", pilot.getPilotLicense());
    }

    @Test
    public void pilotCanFlyPlane(){
        assertEquals("We are ready for take off", pilot.flyPlane());
    }



}
