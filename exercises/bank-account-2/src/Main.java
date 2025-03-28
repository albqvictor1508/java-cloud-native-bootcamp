// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        double saldoInicial = scanner.nextDouble();
        
        double transaction1 = scanner.nextDouble();
        
        double transaction2 = scanner.nextDouble();
        
        double transaction3 = scanner.nextDouble();
        scanner.close();
        
        double[] transactions = {transaction1,transaction2, transaction3};

        double saldoFinal = saldoInicial;
        for(double transaction : transactions) {
          saldoFinal += transaction;
        }
        

        // Na linha abaixo, realize o cálculo do saldo final:
        
        
        System.out.printf("%.2f\n", saldoFinal);

    }
}