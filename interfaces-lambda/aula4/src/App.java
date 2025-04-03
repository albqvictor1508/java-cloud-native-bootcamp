import classes.Client;
import classes.Manager2;


public class App {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        client.setName("maçelo");
        Manager2 manager = new Manager2();
        Client client2 = new Client();

        System.out.println(client.getName() + " " + client2.getName() + " " + manager.getName());
    }
}
