package classes;

public class Manager extends Employee {
    private boolean isAdmin = true;
        
    public Manager(String name, String email, String password) {
        super(name, email, password);
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void generateFinancialReport() {
        //nem sei oque tem que fazer aqui
    }

    public boolean checkIsLogged() {
        return this.getIsLogged();
    }

    public void consultSales(Salesman salesman) {
        System.out.println(salesman.getSales() + " sales made with success");
    }
}
