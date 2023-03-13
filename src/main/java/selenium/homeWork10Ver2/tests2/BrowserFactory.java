package selenium.homeWork10Ver2.tests2;


import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class BrowserFactory {
    WebDriver driver;

    private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();

    @Before
    public void openDrivers () {
    driver = BrowserFactory.getBrowser("Chrome");
    driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }
    public static WebDriver getBrowser(String browserName) {

        WebDriver driver = null;

        switch (browserName) {
           case "Firefox":
                driver = drivers.get("Firefox");
                if (driver == null) {
                    System.setProperty("webdriver.gecko.driver",
                            "/home/tunay/Downloads/geckodriver-v0.32.2-linux-aarch64/geckodriver");
                    driver = new FirefoxDriver();
                    drivers.put("Firefox", driver);
                }
                break;
            case "Edge":
                driver = drivers.get("Edge");
                if (driver == null) {
                    System.setProperty("webdriver.edge.driver",
                            "/home/tunay/Downloads/edgedriver_linux64/msedgedriver");
                    driver = new EdgeDriver();
                    drivers.put("Edge", driver);
                }
                break;
            case "Chrome":
                driver = drivers.get("Chrome");
                if (driver == null) {
                    System.setProperty("webdriver.chrome.driver","/home/tunay/Downloads/chromedriver_linux64 (1)/chromedriver");

                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");

                    driver = new ChromeDriver(options);
                    drivers.put("Chrome", driver);
                }
                break;
        }
        return driver;
    }


   @After
    public void closeAllDriver() {
        for (String key : drivers.keySet()) {
            drivers.get(key).close();
            //drivers.get(key).quit();
        }
    }
}

