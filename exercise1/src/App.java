import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import javax.management.RuntimeErrorException;

public class App {
    public static void main(String[] args) throws Exception {
      List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);
    }

    public List<Integer> sortNumbers(List<Integer> numbers) {
      List<Integer> sortedNumbers = numbers.sort(new Comparator<Integer>() {
        @Override
        public int compare(Integer n1, Integer n2) {
          return Integer.compare(n1, n2);
        }
      });

      return sortedNumbers;
    }

    public Integer sumEvenNumbers(List<Integer> numbers) {
      return numbers.stream().filter(n -> n % 2 == 0).reduce(0, (n1, n2) -> n1 + n2);
    }

    public boolean verifyNumbersPositive(List<Integer> numbers) {
      numbers.forEach(n -> {
        if(n < 0) throw new RuntimeException("only positive numbers");
      });

      return true;
    }

    public List<Integer> removeOddNumbers(List<Integer> numbers) {
      return numbers.stream().filter(n -> n % 2 != 0).toList();
    }
}
