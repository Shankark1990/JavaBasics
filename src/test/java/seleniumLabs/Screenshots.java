package seleniumLabs;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Screenshots {
    public static void takeScreenshots(ChromeDriver driver, String screenshotName) {
        try {
            Date currentDate = new Date();
            String time = new SimpleDateFormat("dd-MM-yyy hh-mm-ss").format(currentDate);

            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(screenshotFile, new File("D:\\TechElliptica\\Projects\\JavaBasics\\screenshots\\" + screenshotName + "_" + time + ".png"));
        } catch (Exception e) {

        }
    }
}
