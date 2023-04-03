package homeWork11;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.concurrent.TimeUnit;

public class ExplicitWaitTest {
    WebDriver driver;
    @Before
    public void getBrowser (){
        System.setProperty("WebDriver.chrome.driver", "/home/tunay/Downloads");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = ("https://parabank.parasoft.com/parabank/index.htm");
        driver.get(url);
    }
   @After
    public void closeBrowser (){
        driver.quit();
    }
}
