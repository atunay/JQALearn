package selenium.homeWork10.tests;

import selenium.homeWork10.pages.P1;
import selenium.homeWork10.pages.P2;

public class Test extends Setting {

    P1 objP1;
    P2 objP2;
    @org.testng.annotations.Test
    public void acition_P1 (){
        objP1 = new P1(driver);

        objP1.actAttr();
        objP1.expAtrr();

    }
    @org.testng.annotations.Test
    public void action_P2 (){
        objP2 = new P2(driver);
        objP2.fillName("asad");
        objP2.fillPass("1234");
        objP2.clickENTR();
       // objP2.warningTxt();
    }
}
