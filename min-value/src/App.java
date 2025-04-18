// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Implemente o código para  ler as 3 transações:
        List<Double> transactions = List.of(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
        double minValue = transactions.get(3);
        
        List<Double> greaterThenMinValue = transactions.stream().filter(t -> t > minValue).toList();
        int contador = greaterThenMinValue.size();
        // Esses valores representam as transações realizadas.
        // Armazene cada valor no array `transacoes` para processá-los depois.



        // TODO: Realize a leitura do valor mínimo (4ª entrada):
       // Este valor será usado como o critério para contar as transações maiores que ele.


        // TODO: Conte as transações maiores que o valor mínimo e verifique se cada valor no array `transacoes`:
       // Caso o valor seja maior que o `valorMinimo`, incrementem o contador.

   
        System.out.println(contador);
    }
}