package testngLabs;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjects.SaucePageObjects;
import seleniumLabs.Screenshots;
import utils.DeleteFilesFromDirectory;

import java.io.IOException;

public class SauceTestNGDemo extends TestBaseClass {
    @Test(priority = 1, invocationCount = 3)
    public void verify_success_login() throws IOException {
        DeleteFilesFromDirectory.deleteFiles();
        loginModule.login("standard_user", "secret_sauce");
        Screenshots.takeScreenshots(driver, method.getName());

    }

    /*Negative test case - enter only password and verify the error message*/
    @Test(priority = 2)
    public void verify_error_msg_empty_username_valid_password() {
        loginModule.login("", "secret_sauce");
        String error_msg = driver.findElement(SaucePageObjects.errorMsg).getText();

        /*Hard assert will assert the result and if result is not expected
        the execution will stop and won't execute further statements*/
        Assert.assertEquals("Epic sadface: Username1 is required", error_msg);
        Screenshots.takeScreenshots(driver, method.getName());

    }

    /*Negative test case - enter only username and verify the error message*/
    @Test(priority = 3)
    public void verify_error_msg_valid_username_empty_password() {

        loginModule.login("standard_user", "");
        String error_msg = driver.findElement(SaucePageObjects.errorMsg).getText();

        /*SoftAssert will assert the result and if result did not get as
        expected still execute the next statements.*/

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Epic sadface: Password1 is required", error_msg);
        Screenshots.takeScreenshots(driver, method.getName());
        softAssert.assertAll();

    }
}
