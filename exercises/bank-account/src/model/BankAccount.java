package model;
public class BankAccount {
  private String agency;
  private int number;
  private String clientName;
  private double balance;

  public BankAccount(String agency, int number, String clientName, double balance) {
    this.agency = agency;
    this.number = number;
    this.clientName = clientName;
    this.balance = balance;
  }

  public String getAgency() {
    return agency;
  }
  public double getBalance() {
    return balance;
  }
  public String getClientName() {
    return clientName;
  }
  public int getNumber() {
    return number;
  }

}
