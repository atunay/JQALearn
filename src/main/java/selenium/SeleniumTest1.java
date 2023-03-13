package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumTest1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.drive","/home/tunay/Downloads");


        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("http://taxime.to");
        driver.quit();
    }
}

/*public class SeleniumTest1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.drive","/home/tunay/Downloads");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.get("http://taxime.to");
        driver.quit();
    }
}*/
