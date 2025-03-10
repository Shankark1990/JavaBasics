package SeleniumLabs;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobjects.SaucePageObjects;
import utils.DeleteFilesFromDirectory;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SauceTestNGDemo {

    ChromeDriver driver;

    public void setup() throws IOException {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        DeleteFilesFromDirectory.deleteFiles();
    }

    public void tearDown() {
        driver.quit();
    }


    @Test
    public void test1() throws IOException {
        setup();

        // enter user name
        driver.findElement(By.xpath(SaucePageObjects.username)).sendKeys("standard_user");
        //enter password
        driver.findElement(By.xpath(SaucePageObjects.password)).sendKeys("secret_sauce");

        // click on login
        driver.findElement(By.xpath(SaucePageObjects.loginbtn)).click();
        Screenshots.takeScreenshots(driver, "afterLogin");
        tearDown();

    }

    @Test
    public void test2() throws IOException {
        setup();

        // enter user name
        driver.findElement(By.xpath(SaucePageObjects.username)).sendKeys("standard_user11");
        //enter password
        driver.findElement(By.xpath(SaucePageObjects.password)).sendKeys("secret_sauce");

        // click on login
        driver.findElement(By.xpath(SaucePageObjects.loginbtn)).click();
        Screenshots.takeScreenshots(driver, "afterLogin");
        tearDown();

    }
}
