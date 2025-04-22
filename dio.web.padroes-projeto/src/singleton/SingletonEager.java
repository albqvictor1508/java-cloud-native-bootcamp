package singleton;

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();
    private String name;
    private int age;

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
