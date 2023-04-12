package stepDefinitions;

import frameWork.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class StepDefinitionPurchase {
    public WebDriver driver;
    public LoginPageSt1 LoginPageObj;
    public InventoryPageSt2 InventoryPageObj;
    public MyCartPageSt3 MyCartPageObj;
    public UserInfoPageSt4 UserInfoPageObj;
    public OverviewPageSt5 OverViewPageObj;
    public CompletePageSt6 CompletePageObj;

    @Before
    public void setUp() {
        driver = BrowserFactory.getDriver("chrome");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @After
    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    @Given("^I am on the login page$")
    public void iAmOnTheLoggedInPage() {
        /*@Before
        driver = BrowserFactory.getDriver("chrome");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();before no need used longer*/


        LoginPageObj = new LoginPageSt1(driver);
        LoginPageObj.navigateToTheLoginPage();
        Assert.assertEquals("https://www.saucedemo.com/", driver.getCurrentUrl());
    }

    @When("^I enter my name and password$")
    public void iEnterMyNameAndPassword() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(LoginPageObj.usernameField));
        LoginPageObj.loginUsername("standard_user");
        wait.until(ExpectedConditions.visibilityOf(LoginPageObj.passwordField));
        LoginPageObj.loginPassword("secret_sauce");
    }

    @And("^I click login button$")
    public void iClickLoginButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(LoginPageObj.loginButton));
        Actions actions = new Actions(driver);
        actions.moveToElement(LoginPageObj.loginButton).click().build().perform();
        //LoginPageObj.clickingTheIcon(); //no need used longer

    }

    @Then("^I should be redirected on the dashboard page$")
    public void iShouldBeRedirectedOnTheDashboardPage() {
        InventoryPageObj = new InventoryPageSt2(driver);
        Assert.assertEquals("Swag Labs", driver.getTitle());
        System.out.println("page one");
    }

    @Given("^I am on the dashboard$")
    public void iAmOnTheDashboard() throws InterruptedException {
        InventoryPageObj = new InventoryPageSt2(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));
        Assert.assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
        //Thread.sleep(1500);
    }

    @And("^I select the goods$")
    public void iSelectTheGoods() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(InventoryPageObj.addToCard_Btn_1));
        InventoryPageObj.selectingTheGood1();
        wait.until(ExpectedConditions.elementToBeClickable(InventoryPageObj.addToCard_Btn_2));
        InventoryPageObj.selectingTheGood2();
    }

    @When("^I click the icon on the corner$")
    public void iClickTheIconOnTheCorner() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(InventoryPageObj.Card_Btn));
        InventoryPageObj.clickingTheCartIcon();
    }

    @Then("^I should be on the cart page$")
    public void iShouldBeOnTheCartPage() {
        MyCartPageObj = new MyCartPageSt3(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/cart.html"));
        System.out.println("page two");
    }

    @Given("I am on the cart page and see my selected goods list")
    public void iAmOnTheCartPageAndSeeMySelectedGoodsList() throws InterruptedException {
        MyCartPageObj = new MyCartPageSt3(driver);
        Assert.assertEquals("https://www.saucedemo.com/cart.html", driver.getCurrentUrl());
        //Thread.sleep(1500);
    }

    @When("I click the button")
    public void iClickTheButton() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(MyCartPageObj.checkout_Btn));
        Assert.assertEquals("https://www.saucedemo.com/cart.html", driver.getCurrentUrl());
        MyCartPageObj.clickingTheCheckout();
        //Thread.sleep(3000);
    }

    @Then("I should be redirected to the purchase information page")
    public void iShouldBeRedirectedToThePurchaseInformationPage() {
        UserInfoPageObj = new UserInfoPageSt4(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/checkout-step-one.html"));
        System.out.println("page three");
    }

    @Given("I am on the purchase information page")
    public void iAmOnThePurchaseInformationPage() throws InterruptedException {
        UserInfoPageObj = new UserInfoPageSt4(driver);
        Assert.assertEquals("https://www.saucedemo.com/checkout-step-one.html", driver.getCurrentUrl());
        //Thread.sleep(1500);

    }

    @When("I enter my first name, last name, and postal code")
    public void iEnterMyFirstNameLastNameAndPostalCode() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(UserInfoPageObj.firstNameField));
        wait.until(ExpectedConditions.visibilityOf(UserInfoPageObj.lastNameField));
        wait.until(ExpectedConditions.visibilityOf(UserInfoPageObj.postalCodeField));
        //UserInfoPageObj.fillingNames("FirstName", "LastName", "1122"); //no need used longer
        Actions actions = new Actions(driver);
        actions.moveToElement(UserInfoPageObj.firstNameField).click().sendKeys("FirstName").build().perform();
        actions.moveToElement(UserInfoPageObj.lastNameField).click().sendKeys("LastName").build().perform();
        actions.moveToElement(UserInfoPageObj.postalCodeField).click().sendKeys("1122").build().perform();
        wait.until((ExpectedConditions.elementToBeClickable(UserInfoPageObj.continueBtn)));
        UserInfoPageObj.confirmingInfo();
    }

    @Then("I should be redirected to the overview page")
    public void iShouldBeRedirectedToTheOverviewPage() {
        OverViewPageObj = new OverviewPageSt5(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/checkout-step-two.html"));
        System.out.println("page four");

    }


    @Given("I am on the overview page")
    public void iAmOnTheOverviewPage() throws InterruptedException {
        OverViewPageObj = new OverviewPageSt5(driver);
        Assert.assertEquals("https://www.saucedemo.com/checkout-step-two.html", driver.getCurrentUrl());
        //Thread.sleep(1500);
    }

    @When("I see my selected goods list")
    public void iSeeMySelectedGoodsList() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(OverViewPageObj.finish_Btn));
        OverViewPageObj.finishing();
        //Thread.sleep(1500);

    }

    @Then("I should be redirected to the finish page and purchase complete")
    public void iShouldBeRedirectedToTheFinishPageAndPurchaseComplete() throws InterruptedException {
        CompletePageObj = new CompletePageSt6(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(CompletePageObj.backToHomeBtn));
        CompletePageObj.thankYouBtn();
        Assert.assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
        //Thread.sleep(1500);
        /*@After
        if (driver != null) {
            driver.quit();
            driver = null;
        } //after no need used longer*/
    }
}

