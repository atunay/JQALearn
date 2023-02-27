package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.drive","/home/tunay/Downloads");
        WebDriver driver = new ChromeDriver();
        driver.get("http://taxime.to");
        //driver.quit();
    }
}
