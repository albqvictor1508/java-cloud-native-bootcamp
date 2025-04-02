package classes;

public class HalfPriceTicket extends Ticket {

    public HalfPriceTicket(String movieName, double value) {
        super(movieName, value);
    }
    
    @Override
    public double getValue() {
        return super.getValue() / 2;
    }
}
