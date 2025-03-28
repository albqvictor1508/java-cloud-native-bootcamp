public class Person {
    private String name;
    private int age;
    private static String surname;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static String getSurname() {
        return surname;
    }

    public static void setSurname(String surname) {
        Person.surname = surname; // ou pode ser outro nome no parâmetro, já q nesse caso, o this não pode ser aplicado a esse atributo porque ele não faz parte da instância, e sim um atributo próprio da classe
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
