package pageobjects;

import org.openqa.selenium.By;

public class SaucePageObjects {

    public static By username=By.xpath("//*[@id='user-name']");
    public static By password =By.xpath("//*[@id=\"password\"]");
    public static By loginbtn=By.xpath("//*[@id=\"login-button\"]");

    public static By errorMsg=By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");

    
}
