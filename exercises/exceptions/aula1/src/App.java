import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner input = new Scanner(System.in).useLocale(Locale.US);
      try {
      System.out.println("Enter your height");
      double height = input.nextDouble();
      input.nextLine();
      input.close();
      System.out.println("height: " + height);
      } catch(InputMismatchException e) {
        System.out.println("Manda o campo direitinho cara: " + e.getMessage());
      } finally {
        System.out.println("Good day!");
      }

    }
}
