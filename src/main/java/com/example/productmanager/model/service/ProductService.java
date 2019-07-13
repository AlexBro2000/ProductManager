package com.example.productmanager.model.service;

import com.example.productmanager.model.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAll();

    List<Product> getAllByCategoryId(Long categoryId);

    void add(Product product);

    void delete(Long id);
}
