package com.app.springbootwebapplicationtesting.Service;

import com.app.springbootwebapplicationtesting.Model.Product;

import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
//here my all business logic
@Service
public class ProductService {
    private List<Product> list=new ArrayList<>();
    private ObservationRegistry registry;

    public void addProduct(Product product) {
        list.add(product);
         Observation.createNotStarted("addProduct",registry)
                .observe(()->product);
    }
    public Optional<List<Product>> getAllProduct() {
        //return Optional.ofNullable(list);

       return Observation.createNotStarted("addProduct",registry)
                .observe(()->Optional.ofNullable(list));
    }

    public Product getProduct(long id) {
        return Observation.createNotStarted("getProduct",registry)
                .observe(()->list.stream()
                        .filter(e->e.id()==id)
                        .findFirst()
                        .orElseThrow(()->new RuntimeException("Product Not Found")));
    }
}
