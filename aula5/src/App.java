import java.util.*;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) throws Exception {
      List<Integer> numbers = Arrays.asList(1,2,3,4,5,200,150,35);
      List<String> languages = List.of("java", "javascript", "kotlin", "rust", "zig");

      Predicate<Integer> greaterThan5 = n -> n > 5;
      Predicate<String> javinhaOuJS = l -> l == "java" || l == "javacript";

      List<String> testLang = languages.stream().filter(javinhaOuJS).toList();
      List<Integer> smallerThan10 = numbers.stream().filter(n -> n < 10).toList();
      List<String> kotlinnn = languages.stream().filter(new Predicate<String>() {

        @Override
        public boolean test(String l) {
          return l == "kotlin";
        }

      }).toList();
    }
}
