package com.example.simpleapi.service;

import com.example.simpleapi.dao.ProductRepository;
import com.example.simpleapi.model.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public product get(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public product save(product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);


    }
}
