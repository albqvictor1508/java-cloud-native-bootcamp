import classes.Employee;
import classes.Salesman;

public class App {
    public static void main(String[] args) throws Exception {
        Salesman salesman = new Salesman("victor", "albuquerque", "83992391231", 5000.0);
        
        Employee salesman2 = new Salesman("gilson", "porronto", "849123123", 220.0);
        salesman2.getName();
        Salesman employee = new Employee("maçelo", "matinz", "0013292349", 400);
    }
}
