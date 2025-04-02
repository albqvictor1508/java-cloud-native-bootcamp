package classes;

public class Salesman extends Employee {
    private int percentPerSold;
    
    public Salesman(String name, String surname, String phone, double salary) {
        super(name, surname, phone, salary);
    }

    public int getPercentPerSold() {
        return percentPerSold;
    }
    public void setPercentPerSold(int percentPerSold) {
        this.percentPerSold = percentPerSold;
    }
}
