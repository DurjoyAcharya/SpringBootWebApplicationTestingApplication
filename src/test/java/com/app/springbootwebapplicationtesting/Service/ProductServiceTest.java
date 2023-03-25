package com.app.springbootwebapplicationtesting.Service;

import io.micrometer.observation.tck.TestObservationRegistry;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.actuate.observability.AutoConfigureObservability;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static io.micrometer.observation.tck.ObservationContextAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@EnableAutoConfiguration
@AutoConfigureObservability
@ComponentScan(basePackageClasses = ProductService.class)
class ProductServiceTest {
    @Autowired
    ProductService service;
    @Autowired
    TestObservationRegistry registry;
    @TestConfiguration
    static class ObservationTestConfiguration {

        @Bean
        TestObservationRegistry observationRegistry() {
            return TestObservationRegistry.create();
        }
    }
    //another test logic

    @Test
    void testObservation()
    {
        service.getAllProduct();
        //micrometer test logic

    }
}