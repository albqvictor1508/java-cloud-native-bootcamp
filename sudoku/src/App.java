<<<<<<< HEAD
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
=======
import static java.util.Objects.isNull;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.Board;
import model.Space;

public class App {
    private final static Scanner scanner = new Scanner(System.in);
    private static Board board;
    private final static int BOARD_LIMIT = 9;

    public static void main(String[] args) throws Exception {
        final Map<String, String> positions = Stream.of(args).collect(Collectors.toMap(k -> k.split(";")[0], v -> v.split(";")[1]));
        while (true) {
            System.out.println("Seleciona uma das opções a seguir:");
            System.out.println("1 - Iniciar novo jogo.");
            System.out.println("2 - Colocar um novo número");
            System.out.println("3 - Remover número");
            System.out.println("4 - Visualizar jogo atual");
            System.out.println("5 - Verificar status do jogo");
            System.out.println("6 - Limpar jogo");
            System.out.println("7 - Finalizar jogo");
            System.out.println("8 - Sair");

            int option = scanner.nextInt();

            switch (option) {
                case 1 -> startGame(positions);
                case 2 -> inputNumber();
                case 3 -> removeNumber();
                case 4 -> showCurrentGame();
                case 5 -> showGameStatus();
                case 6 -> clearGame();
                case 7 -> finishGame();

                case 8 -> System.exit(0);
                default -> System.out.println("Opção inválida, selecione novamente.");
            }
        }
    }

    private static void startGame(final Map<String, String> positions) {

    }

    private static void inputNumber() {
        if(isNull(board)) {
            System.out.println("O jogo ainda não foi iniciado");
            return;
        }
        System.out.println("Informe a coluna em que o número será inserido");
        int col = runUntilGetValidNumber(0, 8);
        System.out.println("Informe a linha em que o número será inserido");
        int row = runUntilGetValidNumber(0, 8);
        System.out.printf("Informe a linha em que estará na posição [%s, %s]\n", col, row);
        int value = runUntilGetValidNumber(1,9);
        if(!board.changeValue(col, row, value)) {
            System.out.printf("A posição [%s, %s] tem um valor fixo!", col, row);
        }
    }

    //tratar erro caso usuário mande string, pra n quebrar o sudoku
    private static int runUntilGetValidNumber(final int min, final int max) {
        int current = scanner.nextInt();
        while (current < min || current > max) {
            System.out.printf("Informe um número entre %s e &s\n", min, max);
            current = scanner.nextInt();
        }
        return current;
    }

    private static void removeNumber() {
        if(isNull(board)) {
            System.out.println("O jogo ainda não foi iniciado");
            return;
        }
        System.out.println("Informe a coluna em que o número está inserido");
        int col = runUntilGetValidNumber(0, 8);
        System.out.println("Informe a linha em que o número está inserido");
        int row = runUntilGetValidNumber(0, 8);

        if(!board.clearValue(col, row)) {
            System.out.printf("A posição [%s, %s] tem um valor fixo!", col, row);
        }
    }

    private static void showCurrentGame() {
        if(isNull(board)) {
            System.out.println("O jogo ainda não foi iniciado");
            return;
        }
        var args = new Object[81];
        var argPos = 0;
        for (int i = 0; i < BOARD_LIMIT; i++) {
            for(List<Space> col: board.getSpaces()) {
                args[argPos++] = " " + ((isNull(col.get(i).getActual())) ? " " : col.get(i).getActual());
            }
            System.out.println("Seu jogo se encontra da seguinte forma:");
            System.out.printf((BoardTemplate.BOARD_TEMPLATE) + "%n", args);
        }

    }

    private static void showGameStatus() {
      if(isNull(board)) {
        System.out.println("O jogo ainda não foi iniciado");
        return;
      }

      System.out.printf("O status é: %s", board.getStatus().getLabel());
      if(board.hasErrors()) {
        System.out.println("O jogo tem erros");
        return;
      }
      System.out.println("O jogo não tem erros");
    }

    private static void clearGame() {
      System.out.println("Tem certeza de que deseja apagar seu jogo? (sim, nao)");
      String confirm = scanner.next();

      while (!confirm.equalsIgnoreCase("sim") && !confirm.equalsIgnoreCase("nao")) {
        System.out.println("Opção inválida, digite novamente");
        scanner.next();
      }
      if(confirm.equalsIgnoreCase("sim")) {
        board.reset();
      }
  }

    private static void finishGame() {
      if(isNull(board)) {
        System.out.println("O jogo ainda não foi iniciado");
        return;
      }
      if(board.hasErrors()) {
        System.out.println("Seu jogo contém erros");
        return;
      }

      if(board.gameIsFinished()) {
        System.out.println("Parabéns você concluiu o jogo");
        showCurrentGame();
        board = null;
        return;
      }

      System.out.println("Deve tá faltando algum espaço");
    }


>>>>>>> 53217cc3c250fe20fd11d9246d90cc48981f1e12
}
