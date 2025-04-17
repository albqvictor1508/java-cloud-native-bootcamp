package dio.springboot;

import dio.springboot.config.MessageConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MessageSystem {
    @Autowired
    private MessageConfig user;
    public void run(String... args) throws Exception {
        System.out.printf("name: %s \n", user.getName());
        System.out.printf("email: %s \n", user.getEmail());
        System.out.printf("phones: %s \n", user.getPhones());
    }
}
