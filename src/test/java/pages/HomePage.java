package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private final AppiumDriver driver;

    public HomePage(AppiumDriver driver) {
        this.driver = driver;
    }

    public WebElement textFieldA() {
        return driver.findElement(AppiumBy.accessibilityId("IntegerA"));
    }

    public WebElement textFieldB() {
        return driver.findElement(AppiumBy.accessibilityId("IntegerB"));
    }

    public WebElement computeSumButton() {
        return driver.findElement(AppiumBy.accessibilityId("ComputeSumButton"));
    }

    public WebElement answerLabel() {
        return driver.findElement(AppiumBy.accessibilityId("Answer"));
    }

    public WebElement showAlertButton() {
        return driver.findElement(AppiumBy.accessibilityId("show alert"));
    }

    public WebElement contactAlertButton() {
        return driver.findElement(AppiumBy.accessibilityId("contact alert"));
    }

    public WebElement locationAlertButton() {
        return driver.findElement(AppiumBy.accessibilityId("location alert"));
    }


    public WebElement testGestureButton() {
        return driver.findElement(AppiumBy.accessibilityId("Test Gesture"));
    }

    public WebElement disabledButton() {
        return driver.findElement(AppiumBy.accessibilityId("DisabledButton"));
    }

    public WebElement slider() {
        return driver.findElement(
                AppiumBy.iOSClassChain("**/XCUIElementTypeSlider[`name == 'AppElem'`]")
        );
    }

    public WebElement crashButton() {
        return driver.findElement(AppiumBy.accessibilityId("Crash"));
    }
}