package dio.springboot;

import org.springframework.stereotype.Component;

@Component
public class Remetente {
    private final String name;
    private String email;
    private String message;

    public Remetente() {
        name = "Agility Telecom";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void showEmail() {
        System.out.printf("Email[name: %s, email: %s, message: $s]\n", name, email, message);
    }
}
