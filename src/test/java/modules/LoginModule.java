package modules;

import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.SaucePageObjects;

public class LoginModule {
    ChromeDriver driver;

    public LoginModule(ChromeDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(SaucePageObjects.username).sendKeys(username);
        driver.findElement(SaucePageObjects.password).sendKeys(password);
        driver.findElement(SaucePageObjects.loginbtn).click();
    }
}
