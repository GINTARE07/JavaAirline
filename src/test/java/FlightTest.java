import airline.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight1;
    Flight flight2;
    Flight flight3;

    Pilot pilot1;
    Pilot pilot2;
    Pilot pilot3;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;



    ArrayList<CabinCrewMember> crewMembers;
    ArrayList<Passenger> passengers;

    @Before
    public void before(){
        cabinCrewMember1 = new CabinCrewMember("Janet", "Flight attendant");
        cabinCrewMember2 = new CabinCrewMember("Juliet", "First officer");
        cabinCrewMember3 = new CabinCrewMember("Jimmy", "captain");
        crewMembers.add(cabinCrewMember1);
        crewMembers.add(cabinCrewMember2);
        crewMembers.add(cabinCrewMember3);
        flight1 = new Flight( ArrayList<CabinCrewMember> crewMembers, ArrayList<Passenger> passengers, "Jimmy", "a22233", "Berlin", "07:35", "Glasgow");
        pilot2 = new Pilot("Jamieson", "captain", "FIHD009F");
        crewMembers = new ArrayList<CabinCrewMember>(Arrays.asList(cabinCrewMember1, cabinCrewMember2, cabinCrewMember3));
        passengers = new ArrayList<Passenger>(Arrays.asList(passenger1, passenger2, passenger3, passenger4));
        flight = new Flight(crewMembers, passengers, pilot2, flight1.getFlightNo(), flight1.getDestination(), flight1.getDepartureTime(), flight1.getDepartureAirport());
//        flight= new Flight(crewMembers, passengers, pilot1, flight2.getFlightNo(), flight2.getDestination(), flight2.getDepartureTime(), flight2.getDepartureAirport());
//        flight= new Flight(crewMembers, passengers, pilot3, flight3.getFlightNo(), flight3.getDestination(), flight3.getDepartureTime(), flight3.getDepartureAirport());

    }
    @Test
    public void flightHasNumber(){
        assertEquals(""
    }
}
