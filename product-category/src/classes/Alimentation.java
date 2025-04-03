package classes;

public class Alimentation  implements Product {
    private double tax = 4;

    @Override
    public double getValueWithTax(double value) {
        double taxValue = (tax * value) / 100;
        return value + taxValue;
    }
}