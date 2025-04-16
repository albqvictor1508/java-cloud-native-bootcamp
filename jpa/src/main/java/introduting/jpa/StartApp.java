package introduting.jpa;

import introduting.jpa.entity.User;
import introduting.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//modo depreciado de criar uma aplicação, mas tá aí caso precise
@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("vito");
        user.setPassword("salve123");
        repository.save(user);

        for(User u: repository.findAll()) {
            System.out.println(u);
        }
    }
}
