import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    private final static Scanner scanner = new Scanner(System.in);
    private static Board board;
    private final static int BOARD_LIMIT = 9;
    public static void main(String[] args) throws Exception {
        final Map<String, String> positions = Stream.of(args).collect(Collectors.toMap(k -> k.split(";")[0], v -> v.split(";")[1]));
        while (true) {
            
        }
    }
}
