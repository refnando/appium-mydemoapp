package tests;

import base.BaseTest;
import io.appium.java_client.AppiumBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.WaitUtils;

public class ComputeSumTest extends BaseTest {

    @Test
    public void verifySum() {
        HomePage home = new HomePage(driver);

        home.textFieldA().sendKeys("3");
        home.textFieldB().sendKeys("5");

        home.computeSumButton().click();

        WaitUtils.waitVisible(driver,
                AppiumBy.accessibilityId("Answer")
        );

        String result = driver.findElement(AppiumBy.accessibilityId("Answer")).getText();

        Assert.assertEquals(result, "8");
    }
}