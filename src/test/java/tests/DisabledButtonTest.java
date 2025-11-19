package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class DisabledButtonTest extends BaseTest {

    @Test
    public void verifyDisabledButton() {
        HomePage home = new HomePage(driver);

        Assert.assertFalse(home.disabledButton().isEnabled(),
                "The button should be disabled ");
    }
}