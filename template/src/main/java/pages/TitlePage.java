package pages;

import base.BasePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
public class TitlePage extends BasePage {
    public AndroidDriver driver;

    By title = By.id("com.getbits.dev:id/fr_title_tv_title");
    By spinner = By.id("com.getbits.dev:id/fr_title_spinner_view");
    By done = By.id("com.getbits.dev:id/fr_done_view");
    By gender = By.xpath("//*[@text='Mrs']");
    By close = By.className("android.widget.ImageButton");

    public TitlePage (AndroidDriver driver) {
        this.driver = driver;
    }

    public void  selectGender() throws InterruptedException {
        driver.findElement(spinner).click();
       Thread.sleep(2000);
        driver.findElement(gender).click();
        Thread.sleep((5000));
    }

    public void should_be_title_page() {
        assert driver.findElement(title).getText().equals("What is your title?");
    }
    public void go_to_firstName_page() {
        driver.findElement(done).click();
    }

    public void go_to_back() {
        driver.findElement(close).click();
    }
}
