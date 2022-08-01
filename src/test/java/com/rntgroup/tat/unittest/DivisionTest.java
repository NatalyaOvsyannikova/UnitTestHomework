package com.rntgroup.tat.unittest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DivisionTest extends BaseCalculatorTest {

    @Test(dataProvider = "divDataProvider")
    @Parameters({"a", "b", "expected"})
    public void testDiv(double a, double b, double expected) {
        double div = calculator.div(a, b);
        Assert.assertEquals(div, expected);
    }

    @Test(expectedExceptions = NumberFormatException.class)
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
