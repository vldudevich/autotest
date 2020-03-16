import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    //It's call driver object from testcase to Pageobject file
    public HomePage(AppiumDriver driver) {PageFactory.initElements(new AppiumFieldDecorator(driver), this);}

    @AndroidFindBy(xpath = "sa.virginmobile.vm:id/btn_signin")
    public WebElement SignIn;

}
