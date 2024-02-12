import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.awt.*;

public class CartTest extends BaseTest {

    @Test
    public void verifyCartFunctionalityTest() throws InterruptedException {
        driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Mac')])[1]")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
        driver.findElement(By.xpath("(//li[@class='dropdown'])[4]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Monitors')]")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[13]")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Tablets')])[1]")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[11]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#cart")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#cart")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#cart")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
    }

    @Test
    public void addMonitorToCartTest() throws InterruptedException, AWTException {
        driver.findElement(By.xpath("(//li[@class='dropdown'])[4]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Monitors')]")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@type='radio'])[6]")).click();
        Utils.scrollDown(driver);
        driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        Thread.sleep(2000);
        Select colour = new Select(driver.findElement(By.cssSelector("#input-option217")));
        colour.selectByValue("4");
        driver.findElement(By.cssSelector("#input-option209")).sendKeys("test");
        driver.findElement(By.cssSelector("#button-upload222")).click();
        Thread.sleep(1000);
        Utils.fileUpload();
        Thread.sleep(3000);
        Utils.acceptAlertBox(driver);
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']")).click();
    }
}
