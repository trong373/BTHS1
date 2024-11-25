package com.example.bths1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello") // Đảm bảo đường dẫn đúng.
    public String sayHello() {
        return "Hello World!";
    }
}