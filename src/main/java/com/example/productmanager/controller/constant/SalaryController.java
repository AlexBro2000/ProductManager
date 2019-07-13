package com.example.productmanager.controller.constant;

import com.example.productmanager.model.service.SalaryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

import static com.example.productmanager.controller.constant.Endpoints.SALARY;
import static com.example.productmanager.controller.constant.Pages.SALARY_PAGE;

@Controller
@RequestMapping(SALARY)
public class SalaryController {

    @Resource
    private SalaryService salaryService;

    @GetMapping
    public String getCalculatedSalary(@RequestParam double salary,
                                    @RequestParam double tax,
                                    @RequestParam double charge, Model model){
        model.addAttribute("salary", salaryService.getCalculatedSalary(salary, tax, charge));
        return SALARY_PAGE;
    }
}
