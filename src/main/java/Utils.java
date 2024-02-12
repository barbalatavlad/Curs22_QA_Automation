import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Utils {
    public static void scrollDown(WebDriver browser){
        JavascriptExecutor js = (JavascriptExecutor) browser;
        js.executeScript("window.scrollBy(0,500)", "");
    }

    public static void fileUpload() throws AWTException {

        //copying file-path to clipboard
        StringSelection ss = new StringSelection("C:\\Users\\Vlad\\Desktop\\asciifull.gif");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        // declaring the robot object
        Robot robot = new Robot();
        // press control v for pasting
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        // release control v
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        // press and release ENTER
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public static void acceptAlertBox(WebDriver driver){
        driver.switchTo().alert().accept();
    }
}
