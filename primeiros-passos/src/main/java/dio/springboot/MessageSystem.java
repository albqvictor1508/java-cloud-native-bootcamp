package dio.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MessageSystem implements CommandLineRunner {
    @Value("${name:without-name}")
    private String name;
    //se passar sem essa parada igual template string do js, vira o valor default, como se eu tivesse inicializado
    @Value("${email:no.reply@albqvictor.com}")
    private String email;
    @Value("${phones}")
    private List<Long> phones;

    @Override
    public void run(String... args) throws Exception {
        System.out.printf("name: %s \n", name);
        System.out.printf("email: %s \n", email);
        System.out.printf("name: %s \n", phones);
    }
}
