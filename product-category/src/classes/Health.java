package classes;
   
public class Health  implements Product {
    private double tax = 1.5;

    @Override
    public double getValueWithTax(double value) {
        double taxValue = (tax * value) / 100;
        return value + taxValue;
    }
}
