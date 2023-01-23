import airline.Passenger;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void before (){
        passenger = new Passenger("Jane", 2);
    }
    @Test
    public void passengerHasName(){
        assertEquals("Jane", passenger.getName());
    }
    @Test
    public void CheckNoOfBags(){
        assertEquals(2, passenger.getNoOfBags());
    }
}
