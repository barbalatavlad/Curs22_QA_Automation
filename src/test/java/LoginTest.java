import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest(){
        driver.findElement(By.xpath("//a[@title='My Account']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        driver.findElement(By.cssSelector("#input-email")).sendKeys(Constants.EMAIL);
        driver.findElement(By.cssSelector("#input-password")).sendKeys(Constants.PASSWORD);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }
}
