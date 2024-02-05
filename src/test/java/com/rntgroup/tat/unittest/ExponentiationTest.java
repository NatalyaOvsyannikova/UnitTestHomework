package com.rntgroup.tat.unittest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExponentiationTest extends BaseCalculatorTest {

    @Test(dataProvider = "powDataProvider")
    public void testPow(double a, double b, double expected) {
        double pow = calculator.pow(a, b);
        Assert.assertEquals(pow, expected);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    @Parameters ({"a", "b"})
    public void testPowNegative(double a, double b) {
        calculator.pow(a, b);
    }

    @DataProvider(name = "powDataProvider")
    public static Object[][] powDataProvider() {
        return new Object[][]{
                {3, 2, 9},
                {9, 0.5, 3}
        };
    }
}
