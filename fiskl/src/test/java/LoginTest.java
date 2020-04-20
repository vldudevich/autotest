import base.BaseTest;
import base.PageObject;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.PasswordPage;

import java.net.MalformedURLException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseTest {

    @Test
    public void Test001failedLoginEmptyField() throws InterruptedException, MalformedURLException {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isInitialized());
        LoginPage loginPage = homePage.loginClk();

        Assert.assertTrue(loginPage.isInitialized());

        loginPage.sendEmailField("  ");
        hideKeyboard();
        loginPage.emailField.clear();
        loginPage.continueClk();
        Assert.assertTrue(loginPage.isInitialized());

        Thread.sleep(5000);
    }
    @Test
    public void Test002failedLoginWrongEmailFormat() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendEmailField("cdudevich");
        hideKeyboard();
        loginPage.emailField.clear();
        loginPage.continueClk();

        Assert.assertTrue(loginPage.isInitialized());
    }
    @Test
    public void Test003failedLoginWrongEmailFormat() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendEmailField("cdudevich");
        hideKeyboard();
        loginPage.emailField.clear();
        loginPage.continueClk();

        Assert.assertTrue(loginPage.isInitialized());
    }
    @Test
    public void Test004failedLoginWrongEmailFormat() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendEmailField("cdudevich@");
        hideKeyboard();
        loginPage.emailField.clear();
        loginPage.continueClk();

        Assert.assertTrue(loginPage.isInitialized());
    }
    @Test
    public void Test005failedLoginWrongEmailFormat() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendEmailField("cdudevich@.com");
        hideKeyboard();
        loginPage.emailField.clear();
        loginPage.continueClk();

        Assert.assertTrue(loginPage.isInitialized());
    }
    @Test
    public void Test006failedLoginWrongEmailFormat() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendEmailField("cdudevichgmail.com");
        hideKeyboard();
        loginPage.emailField.clear();
        loginPage.continueClk();

        Assert.assertTrue(loginPage.isInitialized());
    }
    @Test
    public void Test007failedLoginWrongEmailFormat() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendEmailField("cdudevich@gmail");
        hideKeyboard();
        loginPage.emailField.clear();
        loginPage.continueClk();

        Assert.assertTrue(loginPage.isInitialized());
    }
    @Test
    public void Test008successEmailLogin() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendEmailField("cdudevich@gmail.com");
        hideKeyboard();
        loginPage.continueClk();

    }

//    @Test
//    public void Test009failedPasswordLogin() throws InterruptedException {
//        PasswordPage passwordPage = new PasswordPage(driver);
//        passwordPage.sendPasswordField("  ");
//        hideKeyboard();
//        passwordPage.continueClk();
//        driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Back']")).click();
//    }

    @Test
    public void Test010successPasswordLogin() throws InterruptedException {
        PasswordPage passwordPage = new PasswordPage(driver);
        passwordPage.sendPasswordField("Dudevich987");
        hideKeyboard();
        passwordPage.continueClk();
        Assert.assertFalse(passwordPage.isInitialized());
    }

}
