package classes;

public enum Language {
    DUBBED("dubbed"), SUBTITLED("subtitled");
    private String lang;
    private Language(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }
}
