package com.example.productmanager.controller;

import com.example.productmanager.controller.constant.Pages;
import com.example.productmanager.model.entity.Product;
import com.example.productmanager.model.service.CategoryService;
import com.example.productmanager.model.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import static com.example.productmanager.controller.constant.Endpoints.PRODUCTS;
import static com.example.productmanager.controller.constant.Endpoints.REDIRECT_PREFIX;


@Controller
@RequestMapping(PRODUCTS)
public class ProductsController {

    @Resource
    private ProductService productService;
    @Resource
    private CategoryService categoryService;

    @GetMapping
    public String getProductsPage(Model model){
        model.addAttribute("products", productService.getAll());
        model.addAttribute("categories" , categoryService.getAll());
        return Pages.PRODUCTS_PAGE;
    }

    @PostMapping
    public String addProduct(@ModelAttribute Product product){
        productService.add(product);
        return REDIRECT_PREFIX + PRODUCTS;
    }

    @GetMapping("remove/{id}")
    public String deleteProduct(@PathVariable Long id){
        productService.delete(id);
        return REDIRECT_PREFIX + PRODUCTS;
    }

    @GetMapping("category/{categoryId}")
    public String getProductByCategory(@PathVariable Long categoryId, Model model){
        model.addAttribute("products", productService.getAllByCategoryId(categoryId));
        model.addAttribute("categories" , categoryService.getAll());
        return Pages.PRODUCTS_PAGE;
    }
}
