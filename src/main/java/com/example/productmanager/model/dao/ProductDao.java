package com.example.productmanager.model.dao;

import com.example.productmanager.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Long> {

    List<Product> findAllByCategoryId(Long categoryId);
}
