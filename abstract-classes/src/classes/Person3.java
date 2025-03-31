package classes;

public sealed class Person3 permits Teacher, Streamer {
    private String name;
    private String surname;
    private int age;

    public Person3(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
