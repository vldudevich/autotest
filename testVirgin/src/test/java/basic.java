import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.aspectj.weaver.ast.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class basic extends base {
    @Test
    public void signIn() throws MalformedURLException, InterruptedException {

        AppiumDriver driver = capabilities();
        Thread.sleep(20000);
//        driver.findElementByXPath("sa.virginmobile.vm:id/btn_signin").click();
//        Thread.sleep(10000);
        System.out.println(driver.getContext());
    }

    @Test
    public void second() throws MalformedURLException {

        //System.out.println(driver.getTitle());
    }

}
