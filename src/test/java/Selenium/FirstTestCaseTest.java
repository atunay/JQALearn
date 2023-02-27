package Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.List;

import static org.junit.Assert.*;

public class FirstTestCaseTest {
    WebDriver driver;
    WebElement element;
    //ChromeDriver driver; //second option
    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.drive", "/home/tunay/Downloads"); //??? Is it need it?
        WebDriver driver = new ChromeDriver();
        this.driver = driver; //after importing WebDriver and ChromeDriver configuration could be changed.
    }
    @After
    public void tearDown() throws Exception {
        //driver.navigate().back();
        driver.quit();
    }

    @Test
    public void main() {
        String url = ("https://jqa-academy.com/");
        driver.get(url);
    }

    @Test
    public void t2() {
        //String url = ("https://jqa-academy.com/");
        //driver.get(url);
        driver.navigate().to("https://jqa-academy.com/contact/");
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[2]/div[1]/div/span/input")).sendKeys("Tunay");
    }

    @Test
    public void t1() {
        driver.navigate().to("https://jqa-academy.com/");
        driver.findElement(By.linkText("Научете повече")).click();
    }

    @Test
    public void t3() {
        driver.navigate().to("https://jqa-academy.com/contact/");
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[2]/div[2]/div/span/input")).sendKeys("a.tunay@gamil.com");
    }

    @Test
    public void t4() {
        driver.navigate().to("https://jqa-academy.com/contact/");
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[2]/div[3]/div/span/input")).sendKeys("0885252052");
    }

    @Test
    public void t5() {
        driver.navigate().to("https://jqa-academy.com/contact/");
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[2]/div[4]/div/span/input")).sendKeys("Facebook Ads");
    }

    @Test
    public void t6() {
        driver.navigate().to("https://jqa-academy.com/contact/");
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[2]/div[5]/div/span/input")).sendKeys("QA Automation test");
    }
    @Test
    public void t7() {
        driver.navigate().to("https://jqa-academy.com/contact/");
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[2]/div[6]/div/span/textarea")).sendKeys("I will survive :)");
    }
    @Test
    public void t8() {
        driver.navigate().to("https://jqa-academy.com/contact/");
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[2]/div[7]/span/span/span/label/input")).click();
    }
    @Test
    public void t9() {
        driver.navigate().to("https://jqa-academy.com/contact/");
        driver.findElement(By.className("default-btn")).click(); //submit
    }
    @Test
    public void getText() {
        driver.navigate().to("https://jqa-academy.com/contact/");
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[3]/text()")).getText();
        assertEquals("Вашето съобщение беше изпратено успешно! Ще се свържем с вас в най-кратки срокове.", element.getText());
    }
    @Test
    public void t10(){
        String url = ("https://jqa-academy.com/");
        driver.get(url);
        driver.findElement(By.linkText("Научете повече")).click();
        driver.navigate().back();
        driver.navigate().to("https://jqa-academy.com/contact/");
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[2]/div[1]/div/span/input")).sendKeys("Tunay");
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[2]/div[2]/div/span/input")).sendKeys("a.tunay@gamil.com");
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[2]/div[3]/div/span/input")).sendKeys("0885252052");
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[2]/div[4]/div/span/input")).sendKeys("Facebook Ads");
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[2]/div[5]/div/span/input")).sendKeys("QA Automation test");
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[2]/div[6]/div/span/textarea")).sendKeys("I will survive :)");
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[2]/div[7]/span/span/span/label/input")).click();
        driver.findElement(By.className("default-btn")).click(); //submit
        //driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[2]/div[8]/button")).click(); //submit
        /*driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[3]/text()")).getText();//submit
        assertEquals("Вашето съобщение беше изпратено успешно! Ще се свържем с вас в най-кратки срокове.", element.getText());*/
    }
}
