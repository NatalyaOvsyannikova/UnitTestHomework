package com.rntgroup.tat.unittest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IsPositiveTest extends BaseCalculatorTest {

    @Test(groups = "additional", dataProvider = "positiveDataProvider")
    @Parameters({"a"})
    public void testPositive(long a, boolean expected) {
        Assert.assertEquals(calculator.isPositive(a), expected);
    }

    @DataProvider(name = "positiveDataProvider")
    public static Object[][] positiveDataProvider() {
        return new Object[][]{
                {100, true},
                {0, false},
                {-35, false}
        };
    }

}
