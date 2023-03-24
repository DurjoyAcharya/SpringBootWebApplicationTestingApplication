package com.app.springbootwebapplicationtesting;


import com.app.springbootwebapplicationtesting.Controller.HomeController;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;

@SpringBootTest
public class SmokeTest {
    @Autowired
    private HomeController homeController;


    @Test
    public void contextLoads() throws Exception {
        assertThat(homeController).isNotNull();
    }




}
