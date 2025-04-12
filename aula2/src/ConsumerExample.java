import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
  public static void main(String[] args) {
    List<Integer> numbers1 = List.of(1,2,3,4,5,6,7,7,7,8,8,10);
    List<Integer> numbers2 = Arrays.asList(1,2,2,3,4,5,6,7,7,7,9,10,8);

    Consumer<Integer> getEvenNumbers = number -> { //criei um consumer, que é tipo uma callback function do JS, usando lambda, que é tipo uma arrow function do JS
      if(number % 2 == 0) {
        System.out.println(number);
      }
    };

    numbers1.stream().forEach(getEvenNumbers);
    numbers2.stream().forEach(number -> { // como pode ver, eu simplesmente podia fazer isso
      if(number % 2 == 0) {
        System.out.println(number);
      }
    });
  }
}
