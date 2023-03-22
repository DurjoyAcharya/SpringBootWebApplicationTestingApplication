package com.app.springbootwebapplicationtesting;


import com.app.springbootwebapplicationtesting.Controller.HomeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmokeTest {
    @Autowired
    private HomeController homeController;



}
