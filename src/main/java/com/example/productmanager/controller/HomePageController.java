package com.example.productmanager.controller;

import com.example.productmanager.controller.constant.Pages;
import com.example.productmanager.model.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

import static com.example.productmanager.controller.constant.Endpoints.HOME_PAGE;

@Controller
@RequestMapping(HOME_PAGE)
public class HomePageController {

    @Resource
    private CategoryService categoryService;

    @GetMapping
    public String getHomePage(Model model){
        model.addAttribute("categories", categoryService.getAll());
        return Pages.HOME_PAGE;
    }
}
