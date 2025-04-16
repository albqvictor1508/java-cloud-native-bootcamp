package dio.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "userconfig")
public class MessageConfig {
    private String name;
    private String email;
    private List<Long> phones;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Long> getPhones() {
        return phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhones(List<Long> phones) {
        if(phones.isEmpty()) return;
        this.phones = phones;
    }
}
