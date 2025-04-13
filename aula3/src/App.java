
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
      Supplier<String> helloWorld1 = () -> "Hello World!"; //tipo uma arrow func que retorna o tipo passado no generic e n aceita parâmetro


    //lista com 4 "Hello World!" dentro
    //Stream.generate(Supplier<T>)
    //Collector = Interface
    List<String> helloWorldList1 = Stream.generate(helloWorld1).limit(4).collect(Collectors.toList());
    helloWorldList1.forEach(System.out::println);

    //usando hidden class
    List<String> salveList = Stream.generate(
      new Supplier<String>() {

      @Override
      public String get() {
        return "salve";
      }
  }
  ).toList();

  //o mais simplificadão
  List<String> salveList2 = Stream.generate(() -> "salve 2 papai").limit(6).toList();
  }
}
