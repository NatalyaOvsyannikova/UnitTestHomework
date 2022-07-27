package com.rntgroup.tat.unittest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SquareRootTest extends CalculatorTest{

    @Test(expectedExceptions = NumberFormatException.class)
    public void testSqrtNegative() {
        calculator.sqrt(-10);
    }

    @Test(dataProvider = "sqrtDataProvider")
    @Parameters({"a","expected"})
    public void testSqrt(double a, double expected) {
        double sqrt = calculator.sqrt(a);
        Assert.assertEquals(sqrt, expected);
    }

    @DataProvider(name = "sqrtDataProvider")
    public static Object[][] sqrtDataProvider() {
        return new Object[][]{
                {9, 3},
                {3, 1.7320508075688772},
                {0, 0}
        };
    }

}
