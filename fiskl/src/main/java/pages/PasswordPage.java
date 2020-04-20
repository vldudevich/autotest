package pages;

import base.PageObject;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordPage extends PageObject {
    public PasswordPage(AppiumDriver driver) throws InterruptedException {
        super(driver);
    }

    @FindBy(xpath="//XCUIElementTypeSecureTextField")
    public WebElement passwordField;
    @FindBy(xpath = "//XCUIElementTypeButton[@name='Continue']")
    public WebElement continueBtn;
    @FindBy(xpath = "//XCUIElementTypeButton[@name='Back']")
    public WebElement backBtn;

    public boolean isInitialized() {
        return passwordField.isDisplayed();
    }

    public void sendPasswordField(String password) {
        passwordField.sendKeys(password);
    }
    public void continueClk() {
        continueBtn.click();
    }
    public LoginPage backBtnClk() throws InterruptedException {
        backBtn.click();
        return new LoginPage(driver);
    }



}
