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

    }
}
