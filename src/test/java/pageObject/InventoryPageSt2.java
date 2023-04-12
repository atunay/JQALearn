package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPageSt2 {
    WebDriver driver;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")
    @CacheLookup
    public WebElement addToCard_Btn_1;
    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/button")
    @CacheLookup
    public WebElement addToCard_Btn_2;
    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
    @CacheLookup
    public WebElement Card_Btn;

    public InventoryPageSt2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void selectingTheGood1 () {
        addToCard_Btn_1.click();
    }
    public void selectingTheGood2 () {
        addToCard_Btn_2.click();
    }
    public void clickingTheCartIcon () {
        Card_Btn.click();
    }
}
