package trainings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActionActions {
     //WebDriver driver;
     //WebElement element;
    /*public void Action(){
        WebDriver driver = new ChromeDriver();
        Actions act = new Actions(driver);
        act.keyDown(driver.findElement(By.id("bar-sbq")), Keys.SHIFT);
        act.sendKeys(driver.findElement(By.id("bar-sbq")), "action inteface");
        act.keyUp(driver.findElement(By.id("bar-sbq")), Keys.SHIFT);
        Action action = act.build();
        action.perform();
        //driver.findElement(By.xpath("//*[@id=\"ybar-sbq\"]")).sendKeys("test");
    }
    public void Actions(){
        WebDriver driver = new ChromeDriver();
        Actions act = new Actions(driver);
        act.keyDown(driver.findElement(By.id("bar-sbq")), Keys.SHIFT);
        act.sendKeys(driver.findElement(By.id("bar-sbq")), "actions class");
        act.keyUp(driver.findElement(By.id("bar-sbq")), Keys.SHIFT);
        act.perform();

        act.keyDown(driver.findElement(By.id("bar-sbq")), Keys.SHIFT).sendKeys("both").keyUp(driver.findElement(By.id("bar-sbq")), Keys.SHIFT);
        //driver.findElement(By.xpath("//*[@id=\"ybar-sbq\"]")).sendKeys("test2");
    }*/
    public static void main (String[] args){
        System.setProperty("webdriver.chrome.drive", "/home/tunay/Downloads");

        ChromeOptions options = new ChromeOptions ();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        String url = ("https://www.yahoo.com");
        driver.get(url);
        driver.findElement(By.name("agree")).click();

        driver.findElement(By.xpath("//*[@id=\"ybar-sbq\"]")).sendKeys("test");
    }
}
