package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.drive","/home/tunay/Downloads");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.get("http://taxime.to");
        //driver.quit();
    }
}
