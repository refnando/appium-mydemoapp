package base;

import config.DriverFactory;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected AppiumDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        driver = DriverFactory.createIOSDriver();
        listeners.AllureListener.setDriver(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}