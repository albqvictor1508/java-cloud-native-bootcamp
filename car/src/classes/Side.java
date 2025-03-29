package classes;

public enum Side {
    LEFT("left side"), RIGHT("right side"), STRAIGHT("on straight");
    private String side;

    private Side(String side) {}

    public String getSide() {
        return side;
    }
}
