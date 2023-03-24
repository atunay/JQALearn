package homeWork11;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ExplicitWaitTesting extends ExplicitWaitTest {
    WebDriverWait wait;

    @Test
    public void testExplicitWait1 () throws RuntimeException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")));
        username.click();
        username.sendKeys("asad");
        WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")));
        password.click();
        password.sendKeys("1234");
        WebElement logIn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")));
        logIn.click();
        wait.until(ExpectedConditions.titleIs("ParaBank | Error"));
        System.out.println("Don't forget to register in the system");
    }
}
