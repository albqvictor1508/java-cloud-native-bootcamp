package classes;

public class Employee {
    private final String name;
    private final String surname;
    private String phone;
    private double salary;

    public Employee(String name, String surname, String phone, double salary) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.salary = salary;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public double getSalary() {
        return salary;
    }
    public String getSurname() {
        return surname;
    }
}
