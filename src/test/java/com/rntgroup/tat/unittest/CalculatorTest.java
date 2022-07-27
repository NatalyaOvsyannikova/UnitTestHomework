package com.rntgroup.tat.unittest;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;

public class CalculatorTest {
    protected Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @BeforeGroups(value = {"trigonometry"})
    public void BeforeGroup() {
        System.out.println("Trigonometry");
    }

}
