package selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SecondTestCaseTest {
    WebDriver driver;

    @Before
    public void setUp() {

        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void main() {
        String url = ("https://parabank.parasoft.com/parabank/index.htm");
        driver.get(url);
        String actualTitle = driver.getTitle();
        System.out.println("actual title is: " + actualTitle);
        String expectableTitle = ("ParaBank | Welcome | Online Banking");
        Assert.assertEquals(expectableTitle, actualTitle);
        System.out.println("assert passed");
    }
    @Test
    public void t1() {
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.cssSelector("#loginPanel > form > div:nth-child(2) > input")).sendKeys("asad");
    }
    @Test
    public void t2(){
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("1234");
    }
    @Test
    public void t3(){
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
    }
    @Test
    public void t4(){
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("asad");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
    }
    @Test
    public void t5 (){
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).isDisplayed();

    }
}