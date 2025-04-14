import java.util.concurrent.ThreadLocalRandom;

public class App {
  public static void main(String[] args) throws Exception {
    selectCandidate();
  }

  static double desiredSalary() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }

  static void selectCandidate() {
      String[] candidates = {"victor", "alexsa", "william", "marcelo", "marcos"};
      double desiredSalary = desiredSalary();
      double basicSalary = 2000.0;
      for(int x = 0; x > candidates.length; x++) {
        if(basicSalary < desiredSalary) {
          continue;
        }
        if(basicSalary >= desiredSalary) {
          System.out.println("A negociar");
          continue;
        }

        if(basicSalary == desiredSalary) {
          System.out.println("contratado");
        }
      }
    }
}
