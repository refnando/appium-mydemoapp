package tests;

import base.BaseTest;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.WaitUtils;

public class AlertsTest extends BaseTest {

    @Test
    public void contactAlert() {
        HomePage home = new HomePage(driver);

        home.contactAlertButton().click();

        WaitUtils.waitAlert(driver);

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();

        Assert.assertTrue(text.contains("contact"));
        alert.accept();
    }

    @Test
    public void locationAlert() {
        HomePage home = new HomePage(driver);

        home.locationAlertButton().click();

        WaitUtils.waitAlert(driver);

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();

        Assert.assertTrue(text.contains("location"));
        alert.accept();
    }
}