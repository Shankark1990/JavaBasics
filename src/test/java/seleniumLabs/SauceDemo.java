package seleniumLabs;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SauceDemo {
    public static void main(String[] args) throws IOException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        String userName = "standard_user";
        String password = "secret_sauce";

        // enter username
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(userName);
        takeScreenshots(driver, userName);

        //enter password
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
        takeScreenshots(driver, password);

        // click on login
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        takeScreenshots(driver, "afterLogin");

        // add items to cart.
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
        takeScreenshots(driver,"ProductPage");

        // click on cart
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        takeScreenshots(driver,"YourCart");

        // click on checkout
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();


        // enter details
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Shankar");
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("K");
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("11111");
        takeScreenshots(driver,"YourInformation");

        // click on continue
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        takeScreenshots(driver,"CheckoutOverview");



    }

    public static void takeScreenshots(ChromeDriver driver, String screenshotName) {
        try {
            Date currentDate = new Date();
            String time = new SimpleDateFormat("dd-MM-yyy hh-mm-ss").format(currentDate);

            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(screenshotFile, new File("screenshots/" + screenshotName + "_" + time + ".png"));
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }
}
