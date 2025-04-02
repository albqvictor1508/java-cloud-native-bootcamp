package classes;

public class Salesman extends Employee {
    private boolean isAdmin = false;
    private int sales;

    public Salesman(String name, String email, String password) {
        super(name, email, password);
    }

    public int getSales() {
        return sales;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void makeSale() {
        sales++;
        System.out.println("Sale made with success!");
    }
}
