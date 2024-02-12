import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAccountTest extends BaseTest{

    @Test
    public void createAccountTest(){
        driver.findElement(By.xpath("//a[@title='My Account']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
        driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(Constants.FIRST_NAME);
        driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(Constants.LAST_NAME);
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(Constants.RANDOM_EMAIL);
        driver.findElement(By.cssSelector("#input-telephone")).sendKeys(Constants.TELEPHONE);
        driver.findElement(By.cssSelector("#input-password")).sendKeys(Constants.PASSWORD);
        driver.findElement(By.cssSelector("#input-confirm")).sendKeys(Constants.PASSWORD);
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
    }
}
