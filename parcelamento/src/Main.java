import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double valorTotal = scanner.nextDouble();
        int numeroParcelas = scanner.nextInt();
        double valorPorParcelas = valorTotal / numeroParcelas;
        
        if(valorPorParcelas < 1) {
           System.out.println("Parcelamento nao e possivel");
          return;
        }
       
       System.out.printf("Parcela: %s\n", String.format("%.2f", valorPorParcelas));
        
       // TODO: Crie a lógica para verificar se o parcelamento é possível:
       
       
      // A condição deve garantir que o valor de cada parcela seja maior ou igual a 1. 
       


        scanner.close();
    }
}