package pages;

import base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class FirstNamePage extends BasePage {
    public AndroidDriver driver;

    By title = By.id("com.getbits.dev:id/text_title");
    By close = By.className("android.widget.ImageButton");
    By back = By.id("com.getbits.dev:id/fr_back_view");
    By firstName = By.id("com.getbits.dev:id/input_edit_text");
    By error_text = By.id("com.getbits.dev:id/input_error_text");

    public FirstNamePage (AndroidDriver driver) {
        this.driver = driver;
    }


    public void setFirstName(String FirstName) {
        driver.findElement(firstName).sendKeys(FirstName);
    }

    public void should_be_error_text() {
        assert driver.findElement(error_text).getText().equals("Uh-oh! You need to fill this in!");
    }
    public void should_be_title_page() {
        assert driver.findElement(title).getText().equals("What is your first name?");
    }


}
