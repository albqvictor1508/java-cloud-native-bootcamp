public class Productt {
    private long code;
    private int quantity;
    private double price;

    public Productt(long code, int quantity, double price) {
        this.code = code;
        this.quantity = quantity;
        this.price = price;
    }

    public long getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
