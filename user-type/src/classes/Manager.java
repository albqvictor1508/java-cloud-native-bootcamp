package classes;

public class Manager extends Employee {
    
    public Manager(String name, String email, String password) {
        super(name, email, password);
        super.setIsAdmin(true);
    }

    public void generateFinancialReport(double sales, double balance) {
        System.out.println("Financial Report: " + sales + " sales, " + balance + " balance in cash machine");
    }

    public boolean checkIsLogged() {
        return this.getIsLogged();
    }

    public void consultSales(double sales) {
        System.out.println(sales + " sales made with success");
    }
}
