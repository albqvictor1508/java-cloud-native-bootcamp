package dio.web.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class WellcomeController {

    @GetMapping("/{name}")
    public String welcome(@PathVariable String name) {
        return "Welcome to the first DIO API, %s".formatted(name);
    }
}
