public class PlaneTicket extends Ticket {
    protected boolean isFrequentflyer;


    public PlaneTicket(int id, String origin, String destination, String seatNumber, double price) {
        super(id, origin, destination, seatNumber, price);
    }
}
