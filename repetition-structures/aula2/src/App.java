public class App {
    public static void main(String[] args) throws Exception {
      String[] alunos = {"victor", "albuquerque", "arruda", "seinao", "alexsa"};
      //for tradicional
        for(int x = 0; x < 10; x++) {
          System.out.println(x);
        }
        //foreach
        for(String aluno : alunos) {
          System.out.println(aluno);
        }

        int x = 0;
        int y = 10;
        while(true) {
          x++;
        }
        ///Unreachable porque tem um looping infinito em cima
        do {
          System.out.println("qualquer coisa " + y);
          y++;
        }
        while(y < 100);

        for(int i = 0; i > 100; i++) {
          if(i == 20) {
            continue; //não vai ler as outras linhas do for loop, pulando pra próxima interação (muito importante)
          }
          if(i == 30) {
            break; //vai sair do looping assim que esse if for executado (muito importante também)
          }
        }
    }

}
