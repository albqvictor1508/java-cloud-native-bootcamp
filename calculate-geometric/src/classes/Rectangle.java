package classes;

public class Rectangle implements Geometric {
    private double base;
    private double height;

    @Override
    public double calculateArea() {
        return base * height;
    }
}
