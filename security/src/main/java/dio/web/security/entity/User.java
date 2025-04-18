package dio.web.security.entity;


import java.util.Set;

public class User {
    private String name;
    private String password;
    private final String username;
    private Set<String> roles;

    public User(String name, String password, String username) {
        this.name = name;
        this.password =password;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
}
