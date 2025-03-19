import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
      String[] alunos = {}; //Recomendado
      String alunos2[] = {}; // de maluco
      List<String> alunos3 = new ArrayList<String>();
      alunos3.add("victor");
      alunos3.add("qualquer coisa");
      alunos3.add(1,"qualquer coisa 2"); //inseri na posição 1 do array
      //List Interface tem que ser instanciado pra depois adicionar valor por meio do "add".

      String[] alunos4 = new String[5]; //array com length setado manualmente;
    }
}
