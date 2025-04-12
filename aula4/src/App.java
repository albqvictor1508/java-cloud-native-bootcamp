import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {
      List<Integer> integers = Arrays.asList(1,2,56,32,8,10);

      Function<Integer,String> toDolar = n -> n +" USD";
      Function<Integer, Integer> triple = n -> n * 3;
      //o método "map" recebe uma function, o Stream.generate() recebe um supplier e o forEach recebe um Consumer
      List<String> dorales = integers.stream().map(toDolar).toList();
      List<String> reais = integers.stream().map(n -> "R$ " + n).toList();
      List<Integer> tripleIntegers = integers.stream().map(triple).toList();
      List<Integer> doubleIntegers = integers.stream().map(new Function<Integer,Integer>() {

        @Override
        public Integer apply(Integer n) {
          return n * 2;
        }

      }).toList();

    }
}
