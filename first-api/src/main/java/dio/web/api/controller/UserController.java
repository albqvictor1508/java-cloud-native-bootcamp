package dio.web.api.controller;

import dio.web.api.entity.User;
import dio.web.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping("/{id}")
    public String getUserById(@PathVariable Long id) {
        repository.findById(id);
        return "userId = %s".formatted(id);
    }

    @PostMapping
    public void save(@RequestBody User u) {
        repository.save(u);
    }

    @PostMapping("/{name}")
    public void findByName(@RequestBody String name) {
        repository.findByNameContaining(name);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        repository.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id) {
        repository.updateUser(id);
    }
}
