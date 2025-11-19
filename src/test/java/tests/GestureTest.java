package tests;

import base.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class GestureTest extends BaseTest {

    @Test
    public void tapGestureButton() {
        HomePage home = new HomePage(driver);

        home.testGestureButton().click();

        Assert.assertTrue(driver.findElement(
                AppiumBy.iOSNsPredicateString("label == 'Test Gesture'")
        ).isDisplayed());
    }
}