package com.cognizant.spring_learn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/exercise1/hello")
    public String sayHello() {
        return "Hello from Spring REST!";
    }

}
