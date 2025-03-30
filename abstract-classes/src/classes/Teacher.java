package classes;

public non-sealed class Teacher extends Person {
    private String role;
    private double salary;

    public Teacher(String name, String surname, int age, String role, int salary) {
        super(name, surname, age);
        this.role = role;
        this.salary = salary;
    }
}
