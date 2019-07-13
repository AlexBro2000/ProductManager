package com.example.productmanager.model.service.impl;

import com.example.productmanager.model.dao.ProductDao;
import com.example.productmanager.model.entity.Product;
import com.example.productmanager.model.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DefaultProductService implements ProductService {

    @Resource
    private ProductDao productDao;

    @Override
    public List<Product> getAll() {
        return productDao.findAll();
    }

    @Override
    public List<Product> getAllByCategoryId(Long categoryId) {
        return productDao.findAllByCategoryId(categoryId);
    }

    @Override
    public void add(Product product) {
        productDao.save(product);
    }

    @Override
    public void delete(Long id) {
        productDao.deleteById(id);
    }
}
