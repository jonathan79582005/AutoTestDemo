package mobileAPP.common;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class BaseMethod {

        public AndroidDriver driver = null;

    @BeforeMethod
    public void set() throws Exception{

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "RFCR30J9RPM");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appPackage", "com.newegg.app");
        capabilities.setCapability("appActivity", ".MainActivity");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }
}
