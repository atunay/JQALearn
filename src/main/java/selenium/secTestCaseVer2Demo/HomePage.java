package selenium.secTestCaseVer2Demo;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomePage {
    WebDriver driver;
    @Before
    public void start(){
        System.setProperty("WebDriver.firefox.drive", "/home/tunay/Downloads");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        this.driver = driver;
        String url = ("https://parabank.parasoft.com/parabank/index.htm");
        driver.get(url);

        /*driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("asad");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();

        String Expwrntext = ("Please enter a username and password.");
        String Actwrntext = By.xpath("//*[@id=\"rightPanel\"]/p").findElement(driver).getText();
        System.out.println(Actwrntext);
        Assert.assertEquals(Expwrntext, Actwrntext);
        if (Objects.equals(Expwrntext, Actwrntext)){
            System.out.println("Wrong credentials need to register first");
            driver.close();
        }
        /*driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).getAttribute("register.htm");
        String ExpectedRegAttribute = ("Register");
        System.out.println("ExpectedRegAttribute is " + ExpectedRegAttribute);
        String ActRegAttribute = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).getText();
        System.out.println("Actual Attribute is: " + ActRegAttribute);
        Assert.assertEquals(ExpectedRegAttribute, ActRegAttribute);
        if (Objects.equals(ExpectedRegAttribute,ActRegAttribute)) {
            System.out.println("The test is pass");
            driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
        }*/
    }
   @After
    public void finish (){

        driver.quit();
    }
}
