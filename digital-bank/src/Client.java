public class Client {
  private String name;
  private int agency;
  private double balance;

  public Client(String name, int agency, double balance) {
    this.name = name;
    this.agency = agency;
    this.balance = balance;
  }

  public int getAgency() {
    return agency;
  }

  public double getBalance() {
    return balance;
  }

  public String getName() {
    return name;
  }

  public void setAgency(int agency) {
    this.agency = agency;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setName(String name) {
    this.name = name;
  }
}
