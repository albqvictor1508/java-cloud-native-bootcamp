package classes;

public class Attendant extends Employee {
    private boolean isClosed = false;
    private double balance;

    public Attendant(String name, String email, String password) {
        super(name,email, password);
        setIsAdmin(false);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void receivePayment(double payment) {
        balance += payment;
    }

    public void closeCashMachine() {
        isClosed = false;
    }
}
