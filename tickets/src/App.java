import classes.FamilyTicket;
import classes.HalfPriceTicket;
import classes.Language;
import classes.Movie;
import classes.Ticket;

public class App {
    public static void main(String[] args) throws Exception {
        Movie milesMorales = new Movie("miles morales", Language.DUBBED);
        Ticket ticket = new Ticket(milesMorales.getName(), 35.0);
        HalfPriceTicket halfTicket = new HalfPriceTicket(milesMorales.getName(), ticket.getValue());
        FamilyTicket family = new FamilyTicket(milesMorales.getName(), ticket.getValue());
        family.invitePersonToMovie();
        family.invitePersonToMovie();
        family.invitePersonToMovie();
        System.out.println(halfTicket.getValue() + " " + ticket.getValue() + " " + family.getValue());
    }
}
