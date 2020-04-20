package pages;
import base.PageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {
    public HomePage(AppiumDriver driver) throws InterruptedException {
        super(driver);
    }

    @FindBy(xpath="//XCUIElementTypeButton[@name='With Email']")
    @AndroidFindBy(xpath = "//*[@name = 'With']")
    public WebElement login;

    public LoginPage loginClk() throws InterruptedException {
        login.click();
        return new LoginPage(driver);
    }
    public boolean isInitialized() {
        return login.isDisplayed();
    }


}
