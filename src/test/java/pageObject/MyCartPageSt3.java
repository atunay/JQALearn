package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCartPageSt3 {
    WebDriver driver;
    @FindBy(id="checkout")
    @CacheLookup
    public WebElement checkout_Btn;

    public MyCartPageSt3(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickingTheCheckout (){
        checkout_Btn.click();
        System.out.println("Checkout complete");
    }
}
