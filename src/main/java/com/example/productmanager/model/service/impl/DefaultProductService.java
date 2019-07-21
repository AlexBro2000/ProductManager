package com.example.productmanager.model.service.impl;

import com.example.productmanager.model.dao.ProductDao;
import com.example.productmanager.model.dao.ProductRepository;
import com.example.productmanager.model.entity.Product;
import com.example.productmanager.model.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DefaultProductService implements ProductService {

    @Resource
    private ProductRepository productRepository;
    @Resource
    private ProductDao productDao;

    @Override
    public List<Product> getAll() {
        return productDao.findAll();
    }

    @Override
    public List<Product> getAllByCategoryId(Long categoryId) {
        return productDao.findAllByCategory(categoryId);
    }

    @Override
    public void add(Product product) {
        productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
