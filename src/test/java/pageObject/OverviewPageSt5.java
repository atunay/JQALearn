package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPageSt5 {
    WebDriver driver;
    @FindBy(id = "finish")
    @CacheLookup
    public WebElement finish_Btn;
    public OverviewPageSt5(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void finishing (){
        finish_Btn.click();
    }
}
