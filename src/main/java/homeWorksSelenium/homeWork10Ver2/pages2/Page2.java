package homeWorksSelenium.homeWork10Ver2.pages2;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;

public class Page2 {
    WebDriver driver;

    @FindBy(how= How.XPATH,using="//*[@id=\"loginPanel\"]/form/div[1]/input")
    WebElement name;
    @FindBy(how=How.XPATH,using="//*[@id=\"loginPanel\"]/form/div[2]/input")
    WebElement password;
    @FindBy(how=How.XPATH,using="//*[@id=\"loginPanel\"]/form/div[3]/input")
    WebElement enter;
    @FindBy(how=How.XPATH,using="//*[@id=\"rightPanel\"]/p")
    WebElement text;

    public Page2(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillName (String arg1) {
        name.sendKeys(arg1);
    }
    public void fillPass (String arg2) {
        password.sendKeys(arg2);
    }
    public void clickENTR () {
        enter.click();
        System.out.println("The Test is passed!");
    }
    public void warningTxt (){
    String expectedWarningTxt = ("Please enter a username and password.");
    String actualWarningTxt = text.getText();
        System.out.println(actualWarningTxt);
        Assert.assertEquals(expectedWarningTxt, actualWarningTxt);
        if (Objects.equals(expectedWarningTxt, actualWarningTxt)) {
            System.out.println("Wrong credentials need to register first");
            //driver.close();
        }
    }
}
