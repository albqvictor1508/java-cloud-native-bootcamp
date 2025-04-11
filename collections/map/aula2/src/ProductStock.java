import java.util.HashMap;
import java.util.Map;

public class ProductStock {
    private Map<String, Productt> products;
    private double totalPrice = 0d;

    public ProductStock() {
        products = new HashMap<>();
    }

    public void addNewProduct(String name, double price, int quantity, long code) {
        totalPrice += price * quantity;
        products.put(name, new Productt(code, quantity, price));
    }

    public void showProducts() {
        System.out.println(products);
    }

    public void calculateTotalPrice() {
        System.out.println(totalPrice);
    }

    public void showMoreExpensive() {
        double biggerPrice = 0d;
        for(Productt p : products.values()) {
            if(biggerPrice < p.getPrice() * p.getQuantity()) {
                biggerPrice = p.getPrice() * p.getQuantity();
            }
        }
    } 
}
