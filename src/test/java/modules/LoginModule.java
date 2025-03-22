package modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageobjects.SaucePageObjects;
import utils.TestUtilities;

public class LoginModule {
    ChromeDriver driver;

    public LoginModule(ChromeDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(SaucePageObjects.username).sendKeys(username);
        driver.findElement(SaucePageObjects.password).sendKeys(password);
        TestUtilities.clickElement(driver.findElement(SaucePageObjects.loginbtn));


    }

    public void validate_error_msg(String errorMsg) {
        String actualMsg = driver.findElement(SaucePageObjects.errorMsg).getText();

        Assert.assertEquals(actualMsg, errorMsg);
    }
}
