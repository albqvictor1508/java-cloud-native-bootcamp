import java.util.HashMap;
import java.util.Map;

public class ProductStock {
    private Map<String, Productt> products;

    public ProductStock() {
        products = new HashMap<>();
    }

    public void addNewProduct(String name, double price, int quantity, long code) {
        products.put(name, new Productt(code, quantity, price));
    }
}
