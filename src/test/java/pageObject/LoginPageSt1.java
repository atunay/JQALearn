package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageSt1 {
    WebDriver driver;

    @FindBy(id = "user-name")
    @CacheLookup
    public WebElement usernameField;

    @FindBy(id = "password")
    @CacheLookup
    public WebElement passwordField;

    @FindBy(id = "login-button")
    @CacheLookup
    public WebElement loginButton;

    public LoginPageSt1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToTheLoginPage(){
        String url = "https://www.saucedemo.com/";
        driver.get(url);
    }
    public void loginUsername(String username) {
        usernameField.sendKeys(username);

    }
    public void loginPassword(String password){
        passwordField.sendKeys(password);
    }
    public void clickingTheIcon (){
        loginButton.click();
    }
}
