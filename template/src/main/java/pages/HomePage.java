package pages;

import io.appium.java_client.android.AndroidDriver;

public class HomePage extends Products {

    public AndroidDriver driver;

    public String nameField = "com.androidsample.generalstore:id/nameField";
    public String male = "com.androidsample.generalstore:id/radioMale";
    public String female = "com.androidsample.generalstore:id/radioFeMale";
    public String countryLst = "android:id/text1";
    public String btnLetsShop = "com.androidsample.generalstore:id/btnLetsShop";
    public String rtnBack = "com.androidsample.generalstore:id/appbar_btn_back";
    public HomePage (AndroidDriver driver) {
        this.driver = driver;
    }

    public void setNameField(String name) {
        driver.findElementById(nameField).sendKeys(name);
    }

    public void setGender(String gender) {
        if (gender == "male") {
            driver.findElementById(male).click();
        } else {
            driver.findElementById(female).click();
        }
    }
    public void chCountry(String country) {
        driver.findElementById(countryLst).click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + country + "\").instance(0))");
        driver.findElementByXPath("//*[@text='"+country+"']").click();
    }

    public void clBtnLetsShop() {
        driver.findElementById(btnLetsShop).click();
    }

    public void clRtnBack() {
        driver.findElementById(rtnBack).click();
    }

}
