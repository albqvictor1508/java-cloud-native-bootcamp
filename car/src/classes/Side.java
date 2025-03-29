package classes;

public enum Side {
    LEFT("left side"), RIGHT("right side"), STRAIGHT(" straight");
    private String side;

    private Side(String side) {
        this.side = side;
    }

    public String getSide() {
        return side;
    }
}
