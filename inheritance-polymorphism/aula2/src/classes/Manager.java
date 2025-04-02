package classes;

public non-sealed class Manager extends Employee {
    private String login;
    private String password;

    public Manager(String name, String phone, double salary, String login, String password) {
        setName(name);
        this.login = login;
        this.password = password;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}