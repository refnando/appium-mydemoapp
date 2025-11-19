package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class SliderTest extends BaseTest {

    @Test
    public void adjustSlider() {
        HomePage home = new HomePage(driver);

        home.slider().sendKeys("0.8");

        String value = home.slider().getAttribute("value");

        Assert.assertTrue(value.contains("80"));
    }
}