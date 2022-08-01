package com.rntgroup.tat.unittest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExponentiationTest extends BaseCalculatorTest {

    @Test(dataProvider = "powDataProvider")
    @Parameters({"a", "b", "expected"})
    public void testPow(double a, double b, double expected) {
        double pow = calculator.pow(a, b);
        Assert.assertEquals(pow, expected);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testPowNegative() {
        calculator.pow(-10, 0.5);
    }

    @DataProvider(name = "powDataProvider")
    public static Object[][] powDataProvider() {
        return new Object[][]{
                {3, 2, 9},
                {9, 0.5, 3}
        };
    }
}
