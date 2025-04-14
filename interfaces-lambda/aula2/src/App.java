import java.util.List;
import java.util.function.Consumer;

import classes.User;

public class App {
    public static void main(String[] args) throws Exception {
        List<User> users = List.of(new User("Victor", 18), new User("alexsa", 17), new User("one user", 30), new User("José", 45));

        //hidden class com Consumer
        var method1 = new Consumer<User>() {
            @Override
            public void accept(User user) {
                System.out.println(user);
            }
        };

        users.forEach(method1);
        System.out.println("===================");

        // segundo método (Lambda Function)
        users.forEach(user -> System.out.println(user.name()));
        users.forEach(user -> System.out.println(user.age()));

    }
}
