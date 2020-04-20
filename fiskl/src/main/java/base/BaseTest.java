
package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public static AppiumDriver driver;

    public String platformName = "iOS";
    public String platformVersion = "12.4";
    public String deviceName = "iPhone Xr";
    public String udid = "58EF07D4-CFD7-492C-9E3C-7BA20106AD13";
    public String app = "/Users/vladislav/Downloads/Fiskl.app";
    public String automationName = "XCUITest";
    public String url = "http://127.0.0.1:4723/wd/hub";


    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 11");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.2");
//        capabilities.setCapability(MobileCapabilityType.UDID, "03A72C74-D30E-46F4-8390-108A094844F2");
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/vladislav/Downloads/Fiskl.app");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
        //capabilities.setCapability(MobileCapabilityType.FULL_RESET, true);
        driver = new IOSDriver<IOSElement>(new URL(url),capabilities);
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public void hideKeyboard() {
        driver.hideKeyboard();
    }

}
