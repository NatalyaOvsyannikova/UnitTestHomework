package com.rntgroup.tat.unittest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TrigonometryTest extends BaseCalculatorTest {

    @Test(groups = "trigonometry", dataProvider = "sinDataProvider")
    @Parameters({"a"})
    public void testSin(double a) {
        double sin = calculator.sin(Math.toRadians(a));
        Assert.assertEquals(sin, Math.sin(Math.toRadians(a)));
    }

    @Test(groups = "trigonometry", dataProvider = "cosDataProvider")
    @Parameters({"a"})
    public void testCos(double a) {
        double cos = calculator.cos(Math.toRadians(a));
        Assert.assertEquals(cos, Math.cos(Math.toRadians(a)));
    }

    @Test(groups = "trigonometry", dataProvider = "tgDataProvider")
    @Parameters({"a"})
    public void testTg(double a) {
        double tg = calculator.tg(Math.toRadians(a));
        Assert.assertEquals(tg, Math.tan(Math.toRadians(a)));
    }

    @Test(groups = "trigonometry", dataProvider = "ctgDataProvider")
    @Parameters({"a"})
    public void testCtg(double a) {
        double ctg = calculator.ctg(Math.toRadians(a));
        Assert.assertEquals(ctg, 1 / Math.tan(Math.toRadians(a)));
    }

    @DataProvider(name = "ctgDataProvider")
    public static Object[][] ctgDataProvider() {
        return new Object[][]{
                {90},
                {270},
                {45}
        };
    }

    @DataProvider(name = "tgDataProvider")
    public static Object[][] tgDataProvider() {
        return new Object[][]{
                {45},
                {360},
                {0},
                {180}
        };
    }

    @DataProvider(name = "cosDataProvider")
    public static Object[][] cosDataProvider() {
        return new Object[][]{
                {90},
                {360},
                {0},
                {180}
        };
    }

    @DataProvider(name = "sinDataProvider")
    public static Object[][] sinDataProvider() {
        return new Object[][]{
                {90},
                {360},
                {0},
                {30}
        };
    }

}
