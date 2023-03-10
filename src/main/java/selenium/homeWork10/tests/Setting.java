package selenium.homeWork10.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Setting {
    WebDriver driver;
    @BeforeMethod
    public void getBrowser (){
        System.setProperty("WebDriver.chrome.driver", "/home/tunay/Downloads");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        String url = ("https://parabank.parasoft.com/parabank/index.htm");
        driver.get(url);
    }
    @AfterMethod
    public void closeBrowser (){
        driver.quit();
    }
}
