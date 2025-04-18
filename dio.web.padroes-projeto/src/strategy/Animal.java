package strategy;

public class Animal {
    private String name;
    private String race;
    private Rugido strategy;

    public void setStrategy(Rugido strategy) {
        this.strategy = strategy;
    }

    public Rugido getStrategy() {
        return strategy;
    }
}
