package com.tp5.demo.controller;

import com.tp5.demo.model.Product;
import com.tp5.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/products")  // Adjusted path to be consistent
public class ProductController {

    private final ProductService productService;

    // Constructor injection for better testability and immutability
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @PostMapping("/save")
    public void addProduct(@RequestBody Product product) {
        productService.addNewProduct(product);
    }
}