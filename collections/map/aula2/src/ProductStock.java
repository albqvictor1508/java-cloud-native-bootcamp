import java.util.HashMap;
import java.util.Map;

public class ProductStock {
    private Map<String, Productt> products;
    private double totalPrice = 0;

    public ProductStock() {
        products = new HashMap<>();
    }

    public void addNewProduct(String name, double price, int quantity, long code) {
        totalPrice += price;
        products.put(name, new Productt(code, quantity, price));
    }

    public void showProducts() {
        System.out.println(products);
    }

    public void calculateTotalPrice() {
        System.out.println(totalPrice);
    }

    public void showMoreExpensive() {
        for(String //continuar isso aq)
    } 
}
