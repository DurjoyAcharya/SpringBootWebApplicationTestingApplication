package com.app.springbootwebapplicationtesting;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootWebApplicationTestingApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplicationTestingApplication.class, args);
    }
    @GetMapping("/")
    public String He()
    {
        return "Durjoy, 1925102002";
    }
}
