package planeTest;

import crew.CabinCrew;
import crew.Pilot;
import crew.RankType;
import org.junit.Before;
import org.junit.Test;
import passenger.Passenger;
import plane.Flight;
import plane.Plane;
import plane.PlaneType;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Pilot pilot;
    CabinCrew cabinCrew;
    CabinCrew cabinCrew1;
    Passenger passenger;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Plane plane;
    Plane plane1;
    Flight flight;

    @Before
    public void before(){
        pilot = new Pilot("Nick", RankType.CAPTAIN, "PL8236501S");
        cabinCrew = new CabinCrew("Rachel", RankType.FLIGHT_ATTENDANT);
        cabinCrew1 = new CabinCrew("Mythreyee", RankType.FLIGHT_ATTENDANT);
        passenger = new Passenger("Dev", 3);
        passenger1 = new Passenger("Bob", 1);
        passenger2 = new Passenger("Simona", 5);
        passenger3 = new Passenger("Louise", 4);
        plane = new Plane(PlaneType.BOEING747);
        plane1 = new Plane(PlaneType.CESSNA);
        flight = new Flight("BA4280", "GLA. Glasgow", "RDS. Rhodes", "15:45pm");
    }

    @Test
    public void flightHasPilot(){
        flight.addPilots(pilot);
        assertEquals(1, flight.getPilots());
    }

    @Test
    public void flightHasCabinCrew(){
        flight.addCabinCrew(cabinCrew);
        flight.addCabinCrew(cabinCrew1);
        assertEquals(2,flight.getCabinCrew());
    }

    @Test
    public void flightHasPassengers(){
        flight.setPlane(plane);
        flight.addPassengers(passenger);
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);
        flight.addPassengers(passenger3);
        assertEquals(4,flight.getPassengers());
    }

    @Test
    public void flightHasPlane(){
        flight.setPlane(plane);
        assertEquals(PlaneType.BOEING747, flight.getPlane());
    }

    @Test
    public void flightHasFlightNumber(){
        assertEquals("BA4280", flight.getFlightNumber());
    }

    @Test
    public void flightHasDeparture(){
        assertEquals("GLA. Glasgow", flight.getDeparture());
    }

    @Test
    public void flightHasDestination(){
        assertEquals("RDS. Rhodes", flight.getDestination());
    }

    @Test
    public void flightHasDepartureTime(){
        assertEquals("15:45pm", flight.getDepartureTime());
    }

    @Test
    public void flightHasAvailableSeats(){
        flight.setPlane(plane);
        flight.addPassengers(passenger);
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);
        flight.addPassengers(passenger3);
         assertEquals(146, flight.availableSeats());
    }

    @Test
    public void canBookPassenger(){
        flight.setPlane(plane1);
        flight.addPassengers(passenger);
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);
        assertEquals(2, flight.getPassengers());
    }



}
