package classes;

public class Billet {
    private String ownerName;
    private String role;
    private double price;

    public Billet(String ownerName, String role, double price) {
        this.ownerName = ownerName;
        this.price = price;
        this.role = role;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getRole() {
        return role;
    }

    public double getPrice() {
        return price;
    }
}
