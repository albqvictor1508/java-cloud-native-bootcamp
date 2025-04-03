package classes;

public class BankAccount {
<<<<<<< HEAD
    private String name;
    private double balance;
    private double specialCheckLimit = 0.0;
    private double tax = 0.0;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void checkBalance() {
        System.out.println("Hello, " + name + ", you have " + balance + " USD");
    }

    public void depositMoney(double money) {
        this.especialCheck(money);
        this.balance += money;
    }

    public void withdrawMoney(double money) {
        this.balance -= money;
    }

    public void payBillet(Billet billet) {
        this.balance -= billet.getPrice();  
    }

    public void especialCheck(double money) {
        if(money == 0) return;

        double credit = money > 500 ? money / 2 : money / 10; 
        this.specialCheckLimit += credit;   
        System.out.println("You have a especial check with " + credit + " USD of credit!");
    }

    public void useEspecialCheck(double money) {
        if(this.specialCheckLimit == 0) return;
        this.tax = money * 0.20;
        System.out.println("You used " + money + " USD of special check, you need to pay " + tax + " USD!");
    }

    public void paySpecialCheck() {
        if(this.tax == 0) {
            System.out.println("You don't have tax to pay");
            return;
        }
        if(this.balance < this.tax) {
            System.out.println("You dont have balance to pay, deposit more money");
            return;
        }
        this.balance -= this.tax;
        System.out.println("Fee payed with success!");
    }

    public double getTax() {
        return tax;
    }
=======
    private double balance;
>>>>>>> poo
}
