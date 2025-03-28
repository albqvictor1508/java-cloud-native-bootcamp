public enum Gender {
    MALE("M"), FEMALE("F"), NOT_PROVIDED("N/A");
    private String abbreviation;

    private Gender(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
