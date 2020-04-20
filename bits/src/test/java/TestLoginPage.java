import base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class TestLoginPage extends BaseTest {

    AndroidDriver driver = BaseTest
    @Test
    public void loginSuccess() throws InterruptedException {
        BaseTest h = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        h.setNameField("gfgfgf");
        h.chCountry("Argentina");
        h.setGender("male");
        h.clBtnLetsShop();
        Thread.sleep(5000);
        Assert.assertEquals("Products",driver.findElementById("com.androidsample.generalstore:id/toolbar_title").getText());

        h.clRtnBack();
        h.setNameField("");
    }


    @Test
    public void loginFailed() throws InterruptedException {

        HomePage h = new HomePage(driver);

        Thread.sleep(15000);
        String toastMessage = "";

        h.clBtnLetsShop();
        toastMessage = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");

        Assert.assertEquals("Please enter your name",toastMessage);
    }
}
