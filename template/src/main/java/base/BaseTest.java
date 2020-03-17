package base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    protected AndroidDriver driver;

    public String platformName = "Android";
    public String deviceName = "Xioami";
    public String udid = "c80aee797d94";
    public String app = "/Users/vladislav/Downloads/original.apk";
    public String automationName = "uiautomator2";
    public String url = "http://127.0.0.1:4723/wd/hub";

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,platformName);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
        capabilities.setCapability(MobileCapabilityType.UDID, udid);
        capabilities.setCapability(MobileCapabilityType.APP, app);
        //capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);//timeout
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,automationName);
        driver = new AndroidDriver<MobileElement> (new URL(url),capabilities);
    }

    @AfterClass
    public void tearDown() {
        this.driver.quit();
    }
}
