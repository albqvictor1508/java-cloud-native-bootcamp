package classes;

public class FamilyTicket extends Ticket {
    private int people;
    private double descount = 5;
    private double valueWithDescount = 0;

    public FamilyTicket(String movieName, double value) {
        super(movieName, value);
    }

    public void invitePersonToMovie() {
        System.out.println("1 more person added to family ticket");
        people++;
        if(people >= 3) {
            this.generateDescount();
            return;
        }
    }

    public void generateDescount() {
         double value = super.getValue() * this.people;
          this.descount = (this.descount * value) / 100;
          this.valueWithDescount = (super.getValue() * this.people) - this.descount;
          System.out.println("NEW DESCOUNT: " + this.descount); 
    }

    @Override
    public double getValue() {
        if(people < 3) {
            return super.getValue();
        }

        return valueWithDescount;
    }
}
