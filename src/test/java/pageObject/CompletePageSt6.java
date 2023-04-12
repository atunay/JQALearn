package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompletePageSt6 {
    WebDriver driver;
    @FindBy(id = "back-to-products")
    @CacheLookup
    public WebElement backToHomeBtn;

    public CompletePageSt6(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void thankYouBtn () {
        backToHomeBtn.click();
    }
}
