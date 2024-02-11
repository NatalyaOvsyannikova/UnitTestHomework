package com.rntgroup.tat.unittest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeTest extends BaseCalculatorTest {

    @Test(groups = "additional", dataProvider = "negativeDataProvider")
    public void testNegative(long a, boolean expected) {
        Assert.assertEquals(calculator.isNegative(a), expected);
    }


    @DataProvider(name = "negativeDataProvider")
    public static Object[][] negativeDataProvider() {
        return new Object[][]{
                {-29, true},
                {1, false},
                {0, false}
        };
    }

}
