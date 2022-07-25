package cabinCrewTest;

import crew.CabinCrew;
import crew.RankType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;
    RankType rankType;

    @Before
    public void before(){
        cabinCrew = new CabinCrew("Rachel", RankType.FLIGHT_ATTENDANT);
    }

    @Test
    public void getCabinCrewName(){
        assertEquals("Rachel", cabinCrew.getName());
    }

    @Test
    public void getCabinCrewRank(){
        assertEquals(RankType.FLIGHT_ATTENDANT, cabinCrew.getRankType());
    }

    @Test
    public void getMessage(){
        assertEquals("please listen to the following safety announcement", cabinCrew.passengerMessage());
    }

}
