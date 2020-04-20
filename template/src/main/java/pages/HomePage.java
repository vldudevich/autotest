package pages;
import base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {

    public AndroidDriver driver;

    By login = By.id("com.getbits.dev:id/btnSignIn");
    By sign = By.id("com.getbits.dev:id/btnSignUp");



    public HomePage (AndroidDriver driver) {
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void should_be_home_page () {
        assert driver.findElement(login).getText().equals("Login");
    }

    public void go_to_login_page() {
        driver.findElement(login).click();
    }

    public void go_to_sign_page() {
        driver.findElement(sign).click();
    }

}
