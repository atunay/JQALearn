package trainingsTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.List;

import static org.junit.Assert.*;

public class ActionActionsTest {
    WebDriver driver;
    WebElement element;
    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrom.drive", "/home/tunay/Downloads");
        driver = new ChromeDriver();
        String url = ("https://www.yahoo.com");
        driver.get(url);
        driver.findElement(By.name("agree")).click();
        //driver.findElement(By.xpath("//*[@id=\"ybar-sbq\"]")).sendKeys("test");
    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }

    @Test
    public void action() {
        Actions act = new Actions(driver);
        element = driver.findElement(By.xpath("//*[@id=\"ybar-sbq\"]"));
        act.keyDown(element, Keys.SHIFT);
        act.sendKeys(element, "action inteface");
        act.keyUp(element, Keys.SHIFT);

        Action action = act.build();
        action.perform();
    }

    @Test
    public void actions() {
        Actions act = new Actions(driver);
        element = driver.findElement(By.xpath("//*[@id=\"ybar-sbq\"]"));
        act.keyDown(element, Keys.SHIFT);
        act.sendKeys(element, "actions class");
        act.keyUp(element, Keys.SHIFT);
        act.perform();

       act.keyDown(element, Keys.SHIFT).sendKeys(" both").keyUp(element, Keys.SHIFT).perform();
    }
}