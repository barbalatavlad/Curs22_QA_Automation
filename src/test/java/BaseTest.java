import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;

public class BaseTest {

    WebDriver driver;

    @BeforeTest
    public void setup(){
         driver = new FirefoxDriver();
        driver.get(Constants.URL);
        driver.manage().window().maximize();
    }

    @Test
    public void goToWebsiteTest(){
    }




// 3 produse de bagat in cart si sterse la final

}
