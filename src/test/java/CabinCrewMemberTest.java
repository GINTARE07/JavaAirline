import airline.CabinCrewMember;
import airline.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
   CabinCrewMember cabinCrewMember1;
   CabinCrewMember cabinCrewMember2;
   CabinCrewMember cabinCrewMember3;
   CabinCrewMember cabinCrewMember4;
   @Before
    public void before(){
       cabinCrewMember1 = new CabinCrewMember("Judy", "captain") {
       };cabinCrewMember2 = new CabinCrewMember("John", "First officer") {
       };cabinCrewMember3 = new CabinCrewMember("Jacob", "Flight attendant") {
       };cabinCrewMember4 = new CabinCrewMember("Jasmin", "Flight attendant") {
       };
   }
   @Test
    public void crewMemberHasName(){
       assertEquals("Judy", cabinCrewMember1.getName());
   }
   @Test
   public void crewMemberHasRank(){
      assertEquals("captain", cabinCrewMember1.getRank());
   }
//   @Test
//   public void canRelayMessageToPassengers(){
//      assertEquals("")




}
