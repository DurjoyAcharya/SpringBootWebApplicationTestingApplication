package com.app.springbootwebapplicationtesting.Controller;

import com.app.springbootwebapplicationtesting.Model.Product;
import com.app.springbootwebapplicationtesting.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping
    public String save(@RequestBody Product product)
    {
        service.addProduct(product);
        return "Entity Saved...";
    }
    @GetMapping
    public Optional<List<Product>> getAll()
    {
        return service.getAllProduct();
    }
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable long id){
        return service.getProduct(id);
    }

}
