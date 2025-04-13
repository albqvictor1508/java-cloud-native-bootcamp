import java.util.HashMap;
import java.util.Map;

public class DigitalBank implements IDigitalBank{
  private double salary;
  private Map<Integer, Client> clients;

  public DigitalBank() {
    clients = new HashMap<>();
  }

  @Override
  public void checkout(int code, double balance) {
    if(!clients.containsKey(code)) return;
    Map.Entry<Integer, Client> client = clients.entrySet().stream().filter(c -> c.getKey() == code).toList().getFirst();
    double actualBalance = client.getValue().getBalance() - balance;
    client.getValue().setBalance(actualBalance);
  }

  @Override
  public void deposit(int code, double balance) {
    if(!clients.containsKey(code)) return;
    Map.Entry<Integer, Client> client = clients.entrySet().stream().filter(c -> c.getKey() == code).toList().getFirst();
    double actualBalance = client.getValue().getBalance() + balance;
    client.getValue().setBalance(actualBalance);
  }

  public void transfer(int code, double balance, int transferCode) {
    if(!clients.containsKey(code) || !clients.containsKey(transferCode)) return;
    Client myAccount = clients.get(code);
    if(myAccount.getBalance() < balance) return;
    myAccount.setBalance(myAccount.getBalance() - balance);
    Client transferAccount = clients.get(transferCode);
    transferAccount.setBalance(transferAccount.getBalance() + balance);
  }

  @Override
  public void showSalary(int code) {
    if(!clients.containsKey(code)) return;
    System.out.println(clients.get(code).getBalance());

  }

  public void addNewClient(int code, String name, int agency,double balance) {
    if(clients.containsKey(code)) return;
    clients.put(code, new Client(name, agency, balance));
  }

  public void removeClient(int code) {
    if(!clients.containsKey(code)) return;
    clients.remove(code);
  }
}

