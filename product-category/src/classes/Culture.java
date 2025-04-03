package classes;

public class Culture  implements Product {
    private double tax = 4;

    @Override
    public double getValueWithTax(double value) {
        double taxValue = (tax * value) / 100;
        return value + taxValue;
    }
}
