package classes;

public class Salesman extends Employee {
    private int sales;

    public Salesman(String name, String email, String password) {
        super(name, email, password);
        setIsAdmin(false);
    }

    public int getSales() {
        return sales;
    }

    public void makeSale() {
        sales++;
        System.out.println("Sale made with success!");
    }
}
