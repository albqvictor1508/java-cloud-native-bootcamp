public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person("teste", 20); //aqui eu não tenho acesso a surname
        String personSurname = Person.getSurname(); //aqui eu tenho

        System.out.println(person + " " + personSurname);
    }
}
