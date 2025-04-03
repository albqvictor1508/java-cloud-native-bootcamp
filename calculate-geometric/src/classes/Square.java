package classes;

public class Square implements Geometric {
    private double side;

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }
}
