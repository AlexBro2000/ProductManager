package com.example.productmanager.model.service.impl;

import com.example.productmanager.model.dao.CategoryDao;
import com.example.productmanager.model.entity.Category;
import com.example.productmanager.model.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DefaultCategoryService implements CategoryService {

    @Resource
    private CategoryDao categoryDao;

    @Override
    public List<Category> getAll() {
        return categoryDao.findAll();
    }
}
