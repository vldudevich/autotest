package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class BasePage {
    public AndroidDriver driver;


    public boolean is_element_present(By element) {
        try {
            driver.findElement(element);
        } catch (NoSuchElementException exception) {
            return false;
        }
        return true;
    }
}
