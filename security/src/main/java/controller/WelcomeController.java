package controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping("/{name}")
    public String hello(@PathVariable String name) {
        return "Hello, %s!".formatted(name);
    }

    @GetMapping
    @PreAuthorize("hasAnyRole('MANAGER', 'USERS')")
    public String verify() {
        return "User authenticated";
    }

    @GetMapping
    @PreAuthorize("hasRole('MANAGER')")
    public String verifyManager() {
        return "MANAGER authenticated";
    }
}
