import airline.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot1;
    Pilot pilot2;
    Pilot pilot3;
    @Before
    public void before(){
        pilot1 = new Pilot("Judy", "Captain", "FGH878F");
        pilot2 = new Pilot("Jamieson", "Captain", "FIHD009F");
        pilot3 = new Pilot("Judy", "Captain", "FYTU567F");

    }
    @Test
    public void pilotHasName(){
        assertEquals("Jamieson", pilot2.getName());
    }
    @Test
    public void pilotHasLicenseNo(){
        assertEquals("FYTU567F", pilot3.getLicenseNo());
    }


}
