package plane;

import crew.CabinCrew;
import crew.Pilot;
import passenger.Passenger;


import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot>pilots;
    private ArrayList<CabinCrew>cabinCrew;
    private ArrayList<Passenger>passengers;
    private Plane plane;
    private String flightNumber;
    private String departure;
    private String destination;
    private String departureTime;

    public Flight( String flightNumber, String departure, String destination, String departureTime){
        this.pilots = new ArrayList<>();
        this.cabinCrew = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.departureTime = departureTime;
    }


    public int getPilots() {
        return pilots.size();
    }

    public void addPilots(Pilot pilot) {
        this.pilots.add(pilot);
    }

    public int getCabinCrew() {
        return cabinCrew.size();
    }

    public void addCabinCrew(CabinCrew cabinCrew) {
        this.cabinCrew.add(cabinCrew);
    }

    public int getPassengers() {
        return passengers.size();
    }

    public void addPassengers(Passenger passenger) {
        if (availableSeats() >= 1) {
            this.passengers.add(passenger);
        }
    }

    public PlaneType getPlane() {
        return this.plane.getPlaneType();
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int availableSeats(){
       return plane.getCapacityFromPlaneType() - getPassengers();
    }

}
