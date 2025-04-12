import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Double> numbers = List.of(1.0,30.0,40d,80d,150d);
    }

    public static void sortNumbers(List<Double> numbers ) {
        if(numbers.isEmpty()) {
            throw new RuntimeException("the list is empty");
        }

        numbers.sort((n1,n2) -> Double.compare(n1, n2));
    }
}
