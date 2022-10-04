import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FlightCrewJob flightCrewJob1 = FlightCrewJob.FLIGHT_ATTENDANT;
        FlightCrewJob flightCrewJob2 = FlightCrewJob.CO_PIOLOT;
        FlightCrewJob flightCrewJob3 = FlightCrewJob.PILOT;

        CrewMember crewMember1 = new CrewMember("mathew", flightCrewJob1, 200.0f);
        CrewMember crewMember2 = new CrewMember("mary", flightCrewJob2, 2000.0f);
        CrewMember crewMember3 = new CrewMember("Nancy", flightCrewJob3, 2500.0f);

        Ticket ticket1 = new BusTicket(123, "PA", "LAX", "22A", 400.00);
        Ticket ticket2 = new PlaneTicket(133, "Newcastle", "DC", "1A", 200.00);

        String[] passenger07luggage = {"suit case", "tv"};
        String[] passenger57luggage = {"box", "suitcase", "makeupBox"};
        Passenger passenger07 = new Passenger("Mem", ticket1, 500.00, passenger07luggage );
        Passenger passenger57 = new Passenger("Abdel", ticket1, 1000.0, passenger57luggage);
        passenger57.getAmtOfLuggage();
        passenger07.printTicket();
        crewMember3.serve(passenger57);
        //FlightApp.printAmountForEachThingThatIsPayable();
        List<FlightCrewJob> flightcrewjobs = new ArrayList<>();
        flightcrewjobs.add(flightCrewJob3);
        flightcrewjobs.add(flightCrewJob1);
        flightcrewjobs.add(flightCrewJob2);
        FlightApp.printEachFlightCrewJob((ArrayList<FlightCrewJob>) flightcrewjobs);
        System.out.println("");
        FlightApp.printAllJobsExceptThisCrewMemberJob((ArrayList<FlightCrewJob>) flightcrewjobs, crewMember3);
    }
}