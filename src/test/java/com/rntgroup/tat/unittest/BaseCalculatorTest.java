package com.rntgroup.tat.unittest;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;

public abstract class BaseCalculatorTest {
    protected Calculator calculator;

    @BeforeClass (alwaysRun = true)
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
        calculator = null;
    }

    @BeforeGroups(value = {"trigonometry"})
    public void beforeGroup() {
        System.out.println("Trigonometry");
    }

}
