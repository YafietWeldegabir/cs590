package com.MiniProject.order.controller;

import com.MiniProject.order.domain.Product;
import com.MiniProject.order.repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class productController {

    @Autowired
    productRepository productRepository;

    @PostMapping(value = "/add")
    public List<Product> save(@RequestBody Product product){
        productRepository.save(product);
        return productRepository.findAll();
    }

    @GetMapping(value = "/all")
    public List<Product> getAll(){
        return productRepository.findAll();
    }
}
