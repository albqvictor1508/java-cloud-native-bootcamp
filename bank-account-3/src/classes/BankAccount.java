package classes;

public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void checkBalance() {
        System.out.println("Hello, " + name + ", you have " + balance + " USD");
    }

    public void depositMoney(double money) {
        this.balance += money;
    }

    public void withdrawMoney(double money) {
        this.balance -= money;
    }

    public void payBillet(Billet billet) {
        this.balance -= billet.getPrice();  
    }
}
