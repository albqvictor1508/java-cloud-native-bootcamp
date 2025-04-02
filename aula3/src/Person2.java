public record Person2(String name, String surname, int age) {
    public Person2 {
        System.out.println("================");
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
        System.out.println("================");
    }

    public Person2(String name, String surname) {
        this(name, surname, 0);
    }

    public String completeName() {
        return name + " " + surname;
    }
}
