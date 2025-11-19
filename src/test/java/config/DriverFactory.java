package config;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.github.cdimascio.dotenv.Dotenv;

import java.net.URL;
import java.time.Duration;

public class DriverFactory {

    public static IOSDriver createIOSDriver() throws Exception {

        Dotenv dotenv = Dotenv.load();

        String appPath = dotenv.get("IOS_APP_PATH");
        String deviceName = dotenv.get("DEVICE_NAME");
        String platformVersion = dotenv.get("PLATFORM_VERSION");
        String appiumUrl = dotenv.get("APPIUM_URL");

        XCUITestOptions options = new XCUITestOptions();

        options.setDeviceName(deviceName);
        options.setPlatformVersion(platformVersion);

        // RUTA DEL APP
        options.setApp(appPath);

        // 🔥 BUNDLE ID NECESARIO PARA iOS
        options.setBundleId("io.appium.TestApp");

        // CONFIGURACIONES IMPORTANTES PARA iOS
        options.setAutomationName("XCUITest");
        options.setAutoAcceptAlerts(true);
        options.setAutoDismissAlerts(true);
        options.setNewCommandTimeout(Duration.ofSeconds(60));

        // IMPORTANTE: NO-RESET OFF → evita "app crashed"
        options.setFullReset(false);
        options.setNoReset(false);

        IOSDriver driver = new IOSDriver(new URL(appiumUrl), options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        return driver;
    }
}