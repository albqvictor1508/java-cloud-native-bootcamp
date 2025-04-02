package classes;

public class Employee {
    private String name;
    private String email;
    private String password;
    private boolean isLogged = false;

    public Employee(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void setIsLogged(boolean isLogged) {
        this.isLogged = isLogged;
    }
    
    public boolean getIsLogged() {
        return isLogged;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login(String email, String password) {
        if(email != getEmail() || password != getPassword()) {
            System.out.println("Invalid credentials");
            return;
        }

        System.out.println("You're logged!");
    }

    public void logoff() {
        this.isLogged = false;
        System.out.println("Logoff completed!");
    }
}
