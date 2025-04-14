// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;

abstract class Conta {
    protected double saldo; 

    
    public Conta(double saldo) {
        this.saldo = saldo;
    }

    
    public abstract void sacar(double valor);

    
    public void exibirSaldo() {
        System.out.printf("Saldo Atual: %.2f%n", saldo);
    }
}


class ContaCorrente extends Conta {
    private double limite; 
        
    public ContaCorrente(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if(saldo - valor < -limite) {
          System.out.println("Saque invalido: Excede limite");
          exibirSaldo(); // Exibe o saldo atualizado
          return;
        }
        
        saldo -= valor;
        // TODO: Implemente a lógica para verificar se o saque é permitido considerando o saldo e o limite:
        // Dica: Se saldo - valor >= -limite, o saque é permitido.
        System.out.printf("Saque realizado: %.2f%n", valor);
        exibirSaldo();
    }
}


class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    // Implementação do método sacar para Conta Poupança
    @Override
    public void sacar(double valor) {
      if(valor > saldo) {
        System.out.println("Saque invalido: Saldo insuficiente");
        exibirSaldo(); // Exibe o saldo atualizado
        return;
      }
        // TODO: Implemente a lógica para verificar se o saque é permitido considerando apenas o saldo:
        // Dica: Se saldo >= valor, o saque é permitido.
      saldo -= valor;  
      

        System.out.printf("Saque realizado: %.2f%n", valor);
      exibirSaldo(); // Exibe o saldo atualizado
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Conta conta = null;
        
        String tipoConta = scanner.next(); 
        scanner.nextLine(); 
        scanner.nextLine(); 
        scanner.next();
        double saldoInicial = scanner.nextDouble(); 

            if(tipoConta.equals("Corrente")) {
        double limiteCheque = scanner.nextDouble();
          double valor = scanner.nextDouble(); 
              
              conta = new ContaCorrente(saldoInicial,limiteCheque);
              conta.sacar(valor);
              
            }

        // TODO: Implemente a lógica para criar uma instância de ContaCorrente ou ContaPoupanca:
        // Dica: Use um if para verificar o tipo da conta.
        
            // TODO: Para Conta Corrente, leia também o limite de cheque especial e crie a instância.
        
  
            // TODO: Para Conta Poupança, apenas inicialize a conta com o saldo inicial:
            if(tipoConta.equals("Poupanca")) {
              double valor = scanner.nextDouble();
              
               conta = new ContaPoupanca(saldoInicial);
               conta.sacar(valor);
            }

        while (scanner.hasNextDouble()) {
            double valorSaque = scanner.nextDouble(); 
            conta.sacar(valorSaque); 
        }

        scanner.close(); 
    }
}