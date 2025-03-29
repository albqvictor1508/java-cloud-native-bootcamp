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


}
