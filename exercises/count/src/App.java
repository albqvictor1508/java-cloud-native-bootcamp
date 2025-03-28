import java.util.Scanner;

import exceptions.InvalidParamsException;

public class App {
    public static void main(String[] args) throws Exception {
      catchParams();
    }
    
    public static void catchParams() throws InvalidParamsException {
      Scanner scanner = new Scanner(System.in);
      System.out.println("digite o primeiro número");
      int param1 = scanner.nextInt();
      scanner.nextLine();

      System.out.println("digite o segundo número");
      int param2 = scanner.nextInt();
      scanner.nextLine();
      scanner.close();

      if(param1 > param2) throw new InvalidParamsException("The first number must to be greatter then second");
      int[] params = {param1,param2}; //se eu pegar o params em si, dá um base64 nada a ver, mas posso pegar os valores dos índices
      counter(params);
    }

    public static void counter(int[] params) {
       for(int x = params[0]; x <= params[1]; x++) {
        System.out.println("Estou imprimindo o número: " + x);
      }
    }
}
