package com.rntgroup.tat.unittest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiplicationTest extends CalculatorTest{

    @Test(dataProvider = "multDataProvider")
    @Parameters({"a", "b", "expected"})
    public void testMult(double a, double b, double expected) {
        double mult = calculator.mult(a, b);
        Assert.assertEquals(mult, expected);
    }

    @DataProvider(name = "multDataProvider")
    public static Object[][] multDataProvider() {
        return new Object[][]{
                {42, 1.5, 63},
                {-15, 2, -30}
        };
    }

}
