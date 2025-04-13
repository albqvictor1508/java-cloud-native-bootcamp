import java.util.List;

public class BinaryOperator {
    public static void main(String[] args) throws Exception {
      List<Integer> numbers = List.of(10,20,30,40,50,100);

      java.util.function.BinaryOperator<Integer> sum = (count, value) -> count + value;

      Integer result = numbers.stream().reduce(0, Integer::sum); //0 seria o valor inicial, igual tem no reduce do JS
      Integer mult = numbers.stream().reduce(1, (count, value) -> count * value);
      Integer div = numbers.stream().reduce(0, (n1, n2) -> n1 / n2);
    }
}
