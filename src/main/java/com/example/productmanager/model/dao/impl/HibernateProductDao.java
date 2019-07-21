package com.example.productmanager.model.dao.impl;

import com.example.productmanager.model.dao.ProductDao;
import com.example.productmanager.model.entity.Product;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HibernateProductDao implements ProductDao {

    private static final String FIND_ALL_QUERY = "SELECT p FROM Product p";
    private static final String FIND_ALL_BY_CATEGORY_QUERY = "SELECT p FROM Product p WHERE p.category.id = :category";

    private final EntityManager entityManager;

    @Autowired
    public HibernateProductDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Product> findAll() {
        return getSession().createQuery(FIND_ALL_QUERY, Product.class).list();
    }

    @Override
    public List<Product> findAllByCategory(Long categoryId) {
        return getSession().createQuery(FIND_ALL_BY_CATEGORY_QUERY, Product.class)
                .setParameter("category", categoryId).list();
    }

    @Override
    public void add(Product product) {
       getSession().persist(product);
    }

    @Override
    public void delete(Long id) {
        getSession().delete(getSession().load(Product.class, id));
    }

    private Session getSession(){
        return entityManager.unwrap(Session.class);
    }
}
