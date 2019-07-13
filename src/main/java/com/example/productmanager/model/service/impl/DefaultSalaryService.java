package com.example.productmanager.model.service.impl;

import com.example.productmanager.model.service.SalaryService;
import org.springframework.stereotype.Service;

@Service
public class DefaultSalaryService implements SalaryService {

    @Override
    public double getCalculatedSalary(double salary, double tax, double charge) {
        return salary - ((salary * tax * 0.01) + charge);
    }
}
