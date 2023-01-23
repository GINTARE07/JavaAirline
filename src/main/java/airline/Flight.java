package airline;

import java.util.ArrayList;

public class Flight {
    private ArrayList<CabinCrewMember> crewMembers;
    private ArrayList<Passenger> passengers[];
    private String pilot;
    private String flightNo;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(ArrayList<CabinCrewMember> crewMembers, ArrayList<Passenger>[] passengers, String pilot, String flightNo, String destination, String departureAirport, String departureTime) {
        this.crewMembers = crewMembers;
        this.passengers = passengers;
        this.pilot = pilot;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Flight(ArrayList<CabinCrewMember> crewMembers, ArrayList<Passenger> passengers, Pilot pilot, String flightNo, String destination, String departureTime, String departureAirport) {
    }

    public ArrayList<CabinCrewMember> getCrewMembers() {
        return crewMembers;
    }

    public ArrayList<Passenger>[] getPassengers() {
        return passengers;
    }

    public String getPilot() {
        return pilot;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }
}
