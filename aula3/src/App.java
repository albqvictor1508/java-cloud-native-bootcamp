public class App {
    public static void main(String[] args) throws Exception {
        var person = new Person2("victor", "albuquerque", 18);
        System.out.println(person + " " + person.age());
    }
}
