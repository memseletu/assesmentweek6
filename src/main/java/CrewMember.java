public class CrewMember extends Person implements Servable, Payable {
     private  FlightCrewJob job;
    private float salary;

    public CrewMember(String name, FlightCrewJob job, float salary) {
        super(name);
        this.job = job;
        this.salary = salary;
    }

    public FlightCrewJob getJob() {
        return job;
    }

    public void setJob(FlightCrewJob job) {
        this.job = job;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public void serve(Person person) {
        System.out.println(this.getName()+ "Has served:"+ person.getName());
    }

    @Override
    public void printPaymentAmount() {

    }
}
