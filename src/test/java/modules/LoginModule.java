package modules;

import org.openqa.selenium.chrome.ChromeDriver;
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
}
