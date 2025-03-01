package SeleniumLabs;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class S001SeleniumIntro {
    public static void main(String[] args) {
        ChromeDriver d1=new ChromeDriver();
        d1.manage().window().maximize();
        Dimension dimension=new Dimension(800,600);
        d1.manage().window().setSize(dimension);

        d1.get("https://techelliptica.com/");

    }
}
