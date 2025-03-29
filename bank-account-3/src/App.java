import java.util.Locale;
import java.util.Scanner;

import classes.BankAccount;
import classes.Billet;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter your balance");
        double balance = scanner.nextDouble();
        
        scanner.close();

        checkAccount(name, balance);
    }

    public static void checkAccount(String name, double balance) {
        BankAccount myAccount = new BankAccount(name, balance);
        Billet billet = new Billet("conta de água", "house", 50.0);
        myAccount.depositMoney(150.0);
        myAccount.withdrawMoney(100.0);
        myAccount.payBillet(billet);
        myAccount.depositMoney(400.0);
        myAccount.especialCheck(balance * 0.15);

        myAccount.checkBalance();
    }
}
