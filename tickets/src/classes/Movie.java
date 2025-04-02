package classes;

public class Movie {
    private String name;
    private Language language;

    public Movie(String name, Language language) {
        this.name = name;
        this.language = language;
    }

    public String getLanguage() {
        return language.getLang();
    }

    public String getName() {
        return name;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public void setName(String name) {
        this.name = name;
    }
}
