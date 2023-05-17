package com.udacity.store.controller;

import com.udacity.store.model.Product;
import com.udacity.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "http://localhost:4200")


public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("product/{id}")
    public Optional<Product> getProduct(@PathVariable("id") Long id) {
        return productRepository.findById(id);
    }

    @GetMapping("allProducts")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

}
