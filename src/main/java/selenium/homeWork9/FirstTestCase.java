package selenium.homeWork9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.drive", "/home/tunay/Downloads");
        WebDriver driver = new ChromeDriver();
        String url = ("https://jqa-academy.com/");
        driver.get(url);
        driver.findElement(By.linkText("Научете повече")).click();
        driver.navigate().back();
        driver.navigate().to("https://jqa-academy.com/contact/");
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[2]/div[1]/div/span/input")).sendKeys("Tunay");
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[2]/div[2]/div/span/input")).sendKeys("a.tunay@gamil.com");
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[2]/div[3]/div/span/input")).sendKeys("0885252052");
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[2]/div[4]/div/span/input")).sendKeys("Facebook Ads");
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[2]/div[5]/div/span/input")).sendKeys("QA Automation test");
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[2]/div[6]/div/span/textarea")).sendKeys("I will survive :)");
        driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[2]/div[7]/span/span/span/label/input")).click();
        //driver.findElement(By.className("default-btn")).click(); //submit
        //driver.findElement(By.xpath("//*[@id=\"wpcf7-f334-p246-o1\"]/form/div[2]/div[8]/button")).click(); //submit
    }
}
