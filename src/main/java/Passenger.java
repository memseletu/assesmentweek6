public class Passenger extends Person {
    private Ticket ticket;
    private double creditCardLimit;
    private String[] luggage;

    public Passenger(String name, Ticket ticket, double creditCardLimit, String[] luggage) {
        super(name);
        this.ticket = ticket;
        this.creditCardLimit = creditCardLimit;
        this.luggage = luggage;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public double getCreditCardLimit() {
        return creditCardLimit;
    }

    public void setCreditCardLimit(double creditCardLimit) {
        this.creditCardLimit = creditCardLimit;
    }

    public String[] getLuggage() {
        return luggage;
    }

    public void setLuggage(String[] luggage) {
        this.luggage = luggage;
    }

    public int getAmtOfLuggage(){
      return luggage.length;
    }
    public void printTicket(){
        System.out.println("name: " + getName()+ " "+ '\n' + ticket.getId() +" Origin:" + ticket.getOrigin()+ " " +'\n' + "Destination: " + ticket.getDestination()+ " " +'\n' +"Seat Number: " +ticket.getSeatNumber()+ '\n'+  "=============" );

    }
}
