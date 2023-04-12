package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserInfoPageSt4 {
    WebDriver driver;
    @FindBy(id = "first-name")
    @CacheLookup
    public WebElement firstNameField;
    @FindBy(id = "last-name")
    @CacheLookup
    public WebElement lastNameField;
    @FindBy(id = "postal-code")
    @CacheLookup
    public WebElement postalCodeField;
    @FindBy(id = "continue")
    @CacheLookup
    public WebElement continueBtn;

    public UserInfoPageSt4(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void fillingNames (String firstname, String lastname, String postCode) {
        firstNameField.sendKeys(firstname);
        lastNameField.sendKeys(lastname);
        postalCodeField.sendKeys(postCode);
    }
    public void confirmingInfo () {
        continueBtn.click();
    }
}
