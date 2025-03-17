public class App {
    public static void main(String[] args) throws Exception {
      boolean math = 20 + 20 == 40 && 40 / 2 == 20; //operador lógico AND (precisa que as duas condições sejam verdadeiras pra ser true)
      boolean test = 10 + 10 == 50 || 20 + 20 == 40; //operador OR (precisa de uma só ser verdadeira pra ser true)
      System.out.println(math + " " + test);
    }
}
