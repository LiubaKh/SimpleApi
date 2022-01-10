package com.example.simpleapi.service;

import com.example.simpleapi.dao.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CommandLineStartupRunner implements CommandLineRunner {
    private final ProductRepository productRepository;
 @Autowired
    public CommandLineStartupRunner(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
   public void run(String... args) throws Exception {
       //System.out.println(productRepository.findById(1L));
   }
}

