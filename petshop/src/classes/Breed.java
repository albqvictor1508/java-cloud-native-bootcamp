package classes;

public enum Breed {
    PITBULL("pitbull"), CHOW_CHOW("chow chow"),PINSCHER("pinscher"),POODLE("poodle");
    private String name;

    private Breed(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
