import java.util.Scanner;

import model.BankAccount;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
      System.out.println("enter your agency:");
      String agency = scanner.nextLine();
      System.out.println("enter your number:");
      int number = scanner.nextInt();
      scanner.nextLine();
      System.out.println("enter your name:");
      String clientName = scanner.nextLine();
      System.out.println("enter your balance:");
      double balance = scanner.nextDouble();
      scanner.nextLine();
      scanner.close();

      //formatar o número
      if(agency.length() > 4) {
        throw new RuntimeException("invalid agency");
      }

      BankAccount bank = new BankAccount(agency, number, clientName, balance);
      System.out.println("Hello " + bank.getClientName() + ", thanks to create a bank account with us, " + "your agency is " + bank.getAgency() + ", account " + bank.getNumber() + ", and your balance: " + bank.getBalance());
    }
}
