package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class PageObject {
    protected AppiumDriver driver;

    public PageObject(AppiumDriver driver) throws InterruptedException {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }
}