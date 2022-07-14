package com.hepo.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaCoderApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaCoderApplication.class, args);
    }

    @RequestMapping("/test")
    public String test() {
        return "Hello world3";
    }
}