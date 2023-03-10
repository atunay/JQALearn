package selenium.homeWork10.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;

public class P1 {
        WebDriver driver;
        @FindBy(xpath = "//*[@id=\"loginPanel\"]/p[2]/a")  //?????
        WebElement actAttribute;
        @FindBy(how=How.XPATH,using="//*[@id=\"loginPanel\"]/p[2]/a")
        WebElement expAttribute;
        @FindBy(how=How.XPATH,using="//*[@id=\"loginPanel\"]/p[2]/a")
        WebElement register;

        public P1(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        }

       public void actAttr () {
            String abc = actAttribute.getAttribute("register.htm");
            System.out.println("actual attribute is: " + abc);
        }
        public void expAtrr (){
            String expectedAttributeIs = expAttribute.getText();
            String expectedTXT = ("Register");
            System.out.println("expected attribute is: " + expectedAttributeIs);
            Assert.assertEquals(expectedTXT, expectedAttributeIs);
            if (Objects.equals(expectedTXT, expectedAttributeIs)) {     //????
                System.out.println("The test is pass");
                register.click();
            }
        }
}
