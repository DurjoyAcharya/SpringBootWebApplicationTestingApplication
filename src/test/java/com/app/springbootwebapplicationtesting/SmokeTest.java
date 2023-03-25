package com.app.springbootwebapplicationtesting;

import com.app.springbootwebapplicationtesting.Controller.ProductController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
@ComponentScan(basePackageClasses = ProductController.class)
public class SmokeTest {
    @Autowired
    private ProductController controller;
    @Test
    public void contextLoads() throws Exception{
        assertThat(controller).isNotNull();
    }
}
