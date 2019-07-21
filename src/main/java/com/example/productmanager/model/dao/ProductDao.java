package com.example.productmanager.model.dao;

import com.example.productmanager.model.entity.Product;

import java.util.List;

public interface ProductDao {

     List<Product> findAll();

     List<Product> findAllByCategory(Long categoryId);

     void add(Product product);

     void delete(Long id);
}
