package homeWork10.tests;

import homeWork10.pages.P1;
import homeWork10.pages.P2;

public class Test extends Setting {

    P1 objP1;
    P2 objP2;
    @org.junit.Test
    public void acition_P1 (){
        objP1 = new P1(driver);
        driver.manage().window().maximize();
        objP1.actAttr();
        objP1.expAtrr();

    }
    @org.junit.Test
    public void action_P2 (){
        objP2 = new P2(driver);
        driver.manage().window().maximize();
        objP2.fillName("asad");
        objP2.fillPass("1234");
        objP2.clickENTR();
       // objP2.warningTxt();
    }
}
