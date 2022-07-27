package com.rntgroup.tat.unittest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubtractionTest extends CalculatorTest{

    @Test(dataProvider = "subDataProvider")
    @Parameters({"a", "b", "expected"})
    public void testSub(long a, long b, long expected) {
        long sub = calculator.sub(a, b);
        Assert.assertEquals(sub, expected);
    }

    @DataProvider(name = "subDataProvider")
    public static Object[][] subDataProvider() {
        return new Object[][]{
                {1, 1, 0},
                {5, 10, -5}
        };
    }

}
