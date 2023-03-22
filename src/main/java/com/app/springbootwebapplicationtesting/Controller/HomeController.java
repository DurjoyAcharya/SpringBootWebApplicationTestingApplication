package com.app.springbootwebapplicationtesting.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/greet")
    public String greeting()
    {
        return "<h1>Hello World!</h1>";
    }
}
