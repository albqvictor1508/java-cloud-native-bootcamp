package dio.web.api.repository;

import dio.web.api.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public void save(User u) {
        if(u.getId() == null) {
            System.out.println("Saving user");
        }
    }

    public void findById(Long id) {
        System.out.println("returning user");
    }

    public void findByNameContaining(String name) {
        System.out.println("returning users with this name");
    }

    public void delete(Long id) {
        System.out.printf("Deleting user with id = %s", id);
    }

    public void updateUser(Long id) {
        System.out.println("Updating user");
    }
}
