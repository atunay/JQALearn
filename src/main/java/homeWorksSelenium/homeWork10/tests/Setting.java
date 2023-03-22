package homeWorksSelenium.homeWork10.tests;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*public class Setting {
    WebDriver driver;
    @BeforeMethod
    public static WebDriver getBrowser (String browser){
        System.setProperty("WebDriver.chrome.driver", "/home/tunay/Downloads");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = Setting.getBrowser("Chrome");
        new ChromeDriver(options);

        String url = ("https://parabank.parasoft.com/parabank/index.htm");
        driver.get(url);
        return driver;
    }
    @AfterMethod
    public void closeBrowser (){
        driver.quit();
    }
}*/


public class Setting {
    WebDriver driver;
    @Before
    public void getBrowser (){
        System.setProperty("WebDriver.chrome.driver", "/home/tunay/Downloads");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        String url = ("https://parabank.parasoft.com/parabank/index.htm");
        driver.get(url);
    }
    @After
    public void closeBrowser (){
        driver.quit();
    }
}
