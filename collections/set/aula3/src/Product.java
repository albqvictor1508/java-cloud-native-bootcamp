import java.util.Objects;

public class Product implements Comparable<Product> {
    private String name;
    private double amount;
    private int quantity;
    private long code;

    @Override
    public int compareTo(Product p) {
        return getName().compareToIgnoreCase(p.getName());
    }

    public Product(String name, double amount, int quantity) {
        this.amount =  amount;
        this.name = name;
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public long getCode() {
        return code;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return false;
        if(!(obj instanceof Product p)) return false;
        return getCode() ==  p.getCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode());
    }
}
