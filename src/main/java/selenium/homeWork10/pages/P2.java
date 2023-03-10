package selenium.homeWork10.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class P2 {
    WebDriver driver;

    @FindBy(how= How.XPATH,using="//*[@id=\"loginPanel\"]/form/div[1]/input")
    WebElement name;
    @FindBy(how=How.XPATH,using="//*[@id=\"loginPanel\"]/form/div[2]/input")
    WebElement password;
    @FindBy(how=How.XPATH,using="//*[@id=\"loginPanel\"]/form/div[3]/input")
    WebElement enter;
    @FindBy(how=How.XPATH,using="//*[@id=\"rightPanel\"]/p")
    WebElement text;

    public P2(WebDriver driver){
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
    }
    /*public void warningTxt (){
    String expectedWarningTxt = ("The username and password could not be verified.");
    String actualWarningTxt = text.getText();
        System.out.println(actualWarningTxt);
        Assert.assertEquals(expectedWarningTxt, actualWarningTxt);
        if (Objects.equals(expectedWarningTxt, actualWarningTxt)) {
            System.out.println("Wrong credentials need to register first");
            driver.close();
        }
    }*/
}
