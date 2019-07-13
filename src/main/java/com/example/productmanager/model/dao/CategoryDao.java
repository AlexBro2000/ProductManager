package com.example.productmanager.model.dao;

import com.example.productmanager.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Long> {
}
