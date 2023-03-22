package trainings.secTestCaseVer2Demo;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Objects;

public class SignUp extends HomePage {
    @Test
    public void signUp() {

        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).getAttribute("register.htm");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).getAttribute("register.htm"));
        String ExpectedRegAttribute = ("Register");
        System.out.println("ExpectedRegAttribute is " + ExpectedRegAttribute);
        String ActRegAttribute = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).getText();
        System.out.println("Actual Attribute is: " + ActRegAttribute);
        Assert.assertEquals(ExpectedRegAttribute, ActRegAttribute);
        if (Objects.equals(ExpectedRegAttribute, ActRegAttribute)) {
            System.out.println("The test is pass");
            driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
        }
    }

    @Test
    public void signIn() {
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("asad");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();

        /*String Expwrntext = ("The username and password could not be verified.");
        String Actwrntext = By.xpath("//*[@id=\"rightPanel\"]/p").findElement(driver).getText();
        System.out.println(Actwrntext);
        Assert.assertEquals(Expwrntext, Actwrntext);
        if (Objects.equals(Expwrntext, Actwrntext)) {
            System.out.println("Wrong credentials need to register first");
            driver.close();
        }*/ //закоментирано, когато верификация на сайта работи!!!
    }
}
