package com.venkat.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello Venkat! Your CI/CD pipeline is working 🚀";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is UP";
    }
}
