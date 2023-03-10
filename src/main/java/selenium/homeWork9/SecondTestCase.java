package selenium.homeWork9;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SecondTestCase {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.drive", "/home/tunay/Downloads");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        String url = ("https://parabank.parasoft.com/parabank/index.htm");
        driver.get(url);
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("asad");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
    }
}
