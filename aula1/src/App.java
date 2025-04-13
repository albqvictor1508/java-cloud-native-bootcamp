import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Double> doubles = List.of(0.0,1.0,3.0,20.0,40.5);
        calculateTotal(doubles);
    }

    public static void calculateTotal(List<Double> doubleList) {
        if(doubleList.isEmpty()) {
            throw new RuntimeException("the list is empty!");
        }

        doubleList.stream().mapToDouble(n -> n).sum();
    }
}
