package classes;

public class Client {
    private static String name;
    private int age;

    public Client() {}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Client.name = name;
    }
}
