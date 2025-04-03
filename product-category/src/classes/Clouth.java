package classes;

public class Clouth  implements Product {
    private double tax = 2.5;

    @Override
    public double getValueWithTax(double value) {
        double taxValue = (tax * value) / 100;
        return value + taxValue;
    }
}
