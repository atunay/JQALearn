package trainings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class SeleniumTest1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.drive","/home/tunay/Downloads");

        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new EdgeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        //driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://taxime.to");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/a")).click();
        driver.quit();
    }
}

/*public class SeleniumTest1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.drive","/home/tunay/Downloads");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://taxime.to");
        driver.quit();
    }
}*/
