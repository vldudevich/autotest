package pages;

import base.PageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
    public LoginPage(AppiumDriver driver) throws InterruptedException {
        super(driver);
    }

    @FindBy(xpath="//XCUIElementTypeTextField")
    public WebElement emailField;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='Continue']")
    public WebElement continueBtn;
    @FindBy(xpath = "//XCUIElementTypeButton[@name='Back']")
    public WebElement backBtn;

    public boolean isInitialized() {
        return emailField.isDisplayed();
    }

    public void sendEmailField(String email) {
        emailField.sendKeys(email);
    }
    public PasswordPage continueClk() throws InterruptedException {
        continueBtn.click();
        return new PasswordPage(driver);
    }
    public HomePage backBtnClk() throws InterruptedException {
        backBtn.click();
        return new HomePage(driver);
    }



}
