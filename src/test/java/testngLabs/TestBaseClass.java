package testngLabs;

import modules.LoginModule;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public class TestBaseClass {

    public ChromeDriver driver;
    public LoginModule loginModule;
    public Method method;

    @BeforeMethod
    public void setup(Method method) {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginModule=new LoginModule(driver);
        this.method=method;
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
