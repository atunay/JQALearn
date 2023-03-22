package homeWorksSelenium.homeWork10Ver2.tests2;


import org.junit.Test;
import homeWorksSelenium.homeWork10Ver2.pages2.Page1;
import homeWorksSelenium.homeWork10Ver2.pages2.Page2;

public class Test2 extends BrowserFactory {


    Page1 objPage1;
    Page2 objPage2;

    @Test

    public void sampleTest1() {
        /*driver = BrowserFactory.getBrowser("Edge"); //Може да се ползва и без реализация на @Before / Superclass;
        driver.get("https://parabank.parasoft.com/parabank/index.htm");*/ //С дабавяне на различни браузери за отделните тестове.

        objPage1 = new Page1(driver);
        driver.manage().window().maximize();

        objPage1.actAttr();
        objPage1.expAtrr();
    }
   @Test
    public void sampleTest2 (){
       /*driver = BrowserFactory.getBrowser("Chrome");
       driver.get("https://parabank.parasoft.com/parabank/index.htm");*/
       objPage2 = new Page2(driver);
       driver.manage().window().maximize();


       objPage2.fillName("asad");
       objPage2.fillPass("");
       objPage2.clickENTR();
       objPage2.warningTxt();
    }
}

