package com.rntgroup.tat.unittest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivisionTest extends BaseCalculatorTest {

    @Test(priority = 2, dataProvider = "divDataProvider")
    public void testDiv(double a, double b, double expected) {
        double div = calculator.div(a, b);
        Assert.assertEquals(div, expected);
    }

    @Test(priority = 1, expectedExceptions = NumberFormatException.class)
    public void testDivByZero() {
        calculator.div(1, 0);
    }

    @DataProvider(name = "divDataProvider")
    public static Object[][] divDataProvider() {
        return new Object[][]{
                {-10, 2, -5},
                {-15, -2.5, 6}
        };
    }

}
