public class App {
    public static void main(String[] args) throws Exception {
        String BR = "brasil"; //variável
        BR = "brazil";
        final String USA = "United States of America";//constante
        USA = "qualquer coisa";
        String fullName = concatFullName("victor", "arruda"); //tem que ser estático pra ser chamado em main, se estiverem na mesma classe (eu acredito)
    }

    public static String concatFullName(String name, String surname) {
        return name.concat(" ").concat(surname); // name + " " + surname
    }
}
