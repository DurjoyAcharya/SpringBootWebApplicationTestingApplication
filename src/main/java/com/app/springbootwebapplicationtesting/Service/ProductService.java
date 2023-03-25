package com.app.springbootwebapplicationtesting.Service;

import com.app.springbootwebapplicationtesting.Model.Product;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product> list=new ArrayList<>();
    public void addProduct(Product product) {
        list.add(product);
    }
    public Optional<List<Product>> getAllProduct() {
        return Optional.ofNullable(list);
    }

    public Product getProduct(long id) {
       return list.stream()
                .filter(e->e.id()==id)
                .findFirst()
                .orElseThrow(()->new RuntimeException("Product Not Found"));
    }
}
