package com.example;
 
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
 
@RestController
@EnableAutoConfiguration
public class SpringBootHelloWorld {
 
    @RequestMapping("/")
    String home() {
        return "Hello World Spring Boot application deployed on azure app service on two environment dev and production!";
    }
 
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootHelloWorld.class, args);
    }
 
}
