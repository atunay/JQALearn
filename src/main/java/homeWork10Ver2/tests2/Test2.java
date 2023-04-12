package homeWork10Ver2.tests2;


import homeWork10Ver2.pages2.Page1;
import homeWork10Ver2.pages2.Page2;
import org.junit.Test;

public class Test2 extends BrowserFactory {

    Page1 objPage1;
    Page2 objPage2;

    @Test

    public void sampleTest1() {
        /*driver = BrowserFactory.getBrowser("Edge"); //Може да се ползва и без реализация на @Before / Superclass;
        driver.get("https://parabank.parasoft.com/parabank/index.htm");*/ //С дабавяне на различни браузери за отделните тестове.

        objPage1 = new Page1(driver);
        /*driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //управлението на браузера може да се прави и от тук
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();*/
        objPage1.actAttr();
        objPage1.expAtrr();
    }
   @Test
    public void sampleTest2 (){
       /*driver = BrowserFactory.getBrowser("Chrome");
       driver.get("https://parabank.parasoft.com/parabank/index.htm");*/
       objPage2 = new Page2(driver);


       objPage2.fillName("asad");
       objPage2.fillPass("");
       objPage2.clickENTR();
       objPage2.warningTxt();
    }
}

