package testngLabs.dataprovider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import seleniumLabs.Screenshots;
import testngLabs.TestBaseClass;

public class NegativeTestCase extends TestBaseClass {
    @DataProvider(name = "loginData")
    public static Object[][] dataCarrier() {

        Object[][] data = {
                {"", "secrete_sauce", "Epic sadface: Username is required"},
                {"standard_user", "", "Epic sadface: Password is required"},
                {"", "", "Epic sadface: Username is required"},
                {"wrong username", "wrong password", "Epic sadface: Username and password do not match any user in this service"},
                {"standard_user", "wrong password", "Epic sadface: Username and password do not match any user in this service"}
        };

        /*data can be fetched from xml, json, excel, genAI mode*/
        return data;

    }

    @Test(priority = 0, dataProvider = "loginData")
    public void tdd_negative_testcase(String username, String password, String errorMsg) {
        loginModule.login(username, password);
        loginModule.validate_error_msg(errorMsg);

        Screenshots.takeScreenshots(driver, method.getName());


    }
}
