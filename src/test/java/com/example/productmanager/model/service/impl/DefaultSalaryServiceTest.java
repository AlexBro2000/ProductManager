package com.example.productmanager.model.service.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DefaultSalaryServiceTest {

    private static final double SALARY = 1000;
    private static final double TAX = 20;
    private static final double CHARGE = 200;

    private DefaultSalaryService testedEntry = new DefaultSalaryService();

    @Test
    public void shouldCalculateSalary(){
        double result = testedEntry.getCalculatedSalary(SALARY, TAX, CHARGE);

        assertEquals(600, result, 0);
    }

}