package classes;

public class Ticket {
    private String movieName;
    private double value = 100.0;

    public Ticket(String movieName, double value) {
        this.movieName = movieName;
        this.value = value;
    }

    public String getMovieName() {
        return movieName;
    }

    public double getValue() {
        return value;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setValue(double value) {
        this.value = value;
    }    
}
