import java.util.ArrayList;
import java.util.Collections;

public class FlightApp {
    public static void printEachFlightCrewJob(ArrayList<FlightCrewJob> flightCrewJobs){
      for(FlightCrewJob job: flightCrewJobs){
          System.out.println(job);
      }

    }
    public static void printAmountForEachThingThatIsPayable(Payable[] payable){
        for(int x =0; x< payable.length; x++){
            payable[x].printPaymentAmount();

        }

    }
    public static void sortAndPrintCrewMembersByJob(ArrayList<FlightCrewJob> flightCrewJobs, CrewMember crewMember){
    }
    public static void printAllJobsExceptThisCrewMemberJob(ArrayList<FlightCrewJob> flightCrewJobs, CrewMember crewMember){
        for(FlightCrewJob job: flightCrewJobs){
            if(!job.equals(crewMember.getJob())){
                System.out.println(job);

            }
        }

    }
}
