package com.rntgroup.tat.unittest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTest extends BaseCalculatorTest {

    @Test(dataProvider = "sumDataProvider")
    public void testSum(long a, long b, long expected) {
        long sum = calculator.sum(a, b);
        Assert.assertEquals(sum, expected);
    }

    @DataProvider(name = "sumDataProvider")
    public static Object[][] sumDataProvider() {
        return new Object[][]{
                {1, 1, 2},
                {0, 0, 0},
                {10, -2, 8}
        };
    }
}
