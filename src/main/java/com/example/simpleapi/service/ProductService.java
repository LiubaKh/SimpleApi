package com.example.simpleapi.service;

import com.example.simpleapi.model.product;

import java.util.List;

public interface ProductService {
    product get (Long id);
    List<product> getAll();
    product save(product product);
    void delete(Long id);
}
