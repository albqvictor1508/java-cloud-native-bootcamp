public class App {
    public static void main(String[] args) throws Exception {
        byte age = 18;
        short idk = 32000;
        int idk2 = 2000000000;
        long idk3 = 20000000000000L; //long precisa ter o L no final

        //não compensa ficar usando byte e short, pois a JVM sempre converte pra int

        double size = 1.6857890023234023243;
        double salary = 2.500; //isso é 2,5, não 2500
        float size2 = 1.6857890023234023243F; //tem que ter o F no final se for float

        System.out.println(age + idk + idk2 + idk3 + size + salary + size2);
    }
}
