package singleton;

/*  Singleton "Lazy"
*
*
* */
public class SingletonLazy {
    private final String name;
    private final int age;
    private static SingletonLazy instance;

    private SingletonLazy(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public static SingletonLazy getInstance(String name, int age) {
        if(instance ==  null) {
            instance = new SingletonLazy(name, age);
        }
        return instance;
    }
}
