package ch.fruitbox.springbootapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApiApplication.class, args);
    }
}

@RestController
@RequestMapping("/api")  // Fügt "/api" als Prefix für alle Endpunkte hinzu
class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello FruitBox!";
    }
}
