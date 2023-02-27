package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class SecondTestCase {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrom.drive", "/home/tunay/Downloads");
        WebDriver driver;

        driver = new ChromeDriver();
        String url = ("https://parabank.parasoft.com/parabank/index.htm");
        driver.get(url);
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("asad");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
    }
}
