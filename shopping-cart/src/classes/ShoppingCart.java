package classes;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;
    private double cartAmount;

    public void addNewProduct(Product product) {
        this.products.add(product);
        this.cartAmount += product.amount() * product.quantity();
    }

    public double getCartAmount() {
        return this.cartAmount;
    }

    public void showAllProducts() {
        for(Product p: this.products) {
            System.out.println(p);
        }
    }

    public void removeProductByName(String name) {
        List<Product> productsToRemoveList = new ArrayList<>();

        for(Product p : this.products) {
            if(p.name() != name) continue;
            productsToRemoveList.add(p);
        }
        products.removeAll(productsToRemoveList);
    }
}