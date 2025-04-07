package classes;

public record Product(String name, double amount, int quantity) {
    @Override
    public final String toString() {
        return name + ", " + amount;
    }
}
