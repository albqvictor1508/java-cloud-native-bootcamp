public class App {
    public static void main(String[] args) throws Exception {
        int number1 = 20;
        int number2 = 20;
        boolean isEqual = number1 == number2;
        System.out.println(isEqual ? "VERDADEIRO" : "FALSO");
        isEqual = number1 != number2;
        System.out.println(isEqual ? "VERDADEIRO" : "FALSO");
        isEqual = number1 > number2;
        System.out.println(isEqual ? "VERDADEIRO" : "FALSO");
        isEqual = number1 < number2;
        System.out.println(isEqual ? "VERDADEIRO" : "FALSO");
        String nome1 = "victor";
        String nome2 = "albuquerque";
        System.out.println(nome1.equals(nome2)); //strings tem o método "equals"

    }
}
