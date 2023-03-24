package homeWork10Ver2.tests2;


import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BrowserFactory {
    WebDriver driver;

    private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();

    @Before
    public void openDrivers() {
        driver = BrowserFactory.getBrowser("Edge");
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //управлението на браузера може да се прави и от тук
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    public static WebDriver getBrowser(String browserName) {

        WebDriver driver = null;

        switch (browserName) {
            case "Firefox":
                driver = drivers.get("Firefox");
                if (driver == null) {
                    System.setProperty("webdriver.gecko.driver", "/home/tunay/Downloads/geckodriver-v0.32.2-linux-aarch64/geckodriver");
                    driver = new FirefoxDriver();
                    drivers.put("Firefox", driver);
                }
                break;
            case "Edge":
                driver = drivers.get("Edge");
                if (driver == null) {
                    System.setProperty("webdriver.edge.driver", "/home/tunay/Downloads/edgedriver_linux64/msedgedriver");

                    EdgeOptions options = new EdgeOptions();
                    options.addArguments("--remote-allow-origins=*");

                    driver = new EdgeDriver(options);
                    drivers.put("Edge", driver);
                }
                break;
            case "Chrome":
                driver = drivers.get("Chrome");
                if (driver == null) {
                    System.setProperty("webdriver.chrome.driver", "/home/tunay/Downloads/chromedriver_linux64 (1)/chromedriver");

                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");

                    driver = new ChromeDriver(options);
                   /* driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); може да се задават и тук методи за управление на браузера.
                    driver.manage().window().maximize();
                    driver.manage().deleteAllCookies();*/
                    drivers.put("Chrome", driver);
                }
                break;
        }
        return driver;
    }


    /*@After
    public void closeAllDriver() {
        for (String key : drivers.keySet()) {
            drivers.get(key).close();
            //drivers.get(key).quit();
        }
    }*/
     /*@After
    public void closeAllDriver() {
        for (String key : drivers.keySet()) {
            drivers.get(key).close();
            //drivers.get(key).quit();
        }
    }*/
}

