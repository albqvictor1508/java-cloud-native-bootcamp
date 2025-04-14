import classes.Employee;
import classes.Manager;
import classes.Salesman;

public class App {
    public static void main(String[] args) throws Exception {

    }
    public static void printEmployee(Employee employee) {
        System.out.printf("==========%s==========", ((Manager) employee).getClass().getCanonicalName());
        if(employee instanceof Manager manager) {
            manager.setLogin("maçelo");
            manager.setPassword("maçelo1234");
            manager.setName("maçelo");
        }   
    }
}
