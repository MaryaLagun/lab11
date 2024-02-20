package tests;

import basepage.HomePage;
import basepage.JQueryUIPage;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class JQueryTest extends BaseTest{
    HomePage homePage=new HomePage();
    JQueryUIPage jQueryuiPage=new JQueryUIPage();
    @Test
    public void JQueryTest(){
        homePage.initDriver();
        homePage.clickABTestingLink("JQuery UI Menus");
    //     String isDisable=jQueryuiPage.getDisableLink().getAttribute("aria-disable");
 jQueryuiPage.backToSource();
 boolean isHeaderExist=jQueryuiPage.isHeaderExist();
 Assert.assertTrue(isHeaderExist);
// jQueryuiPage.getBackToUI();
// jQueryuiPage.isHeaderExist();

      //  Assert.assertTrue();
    //    jQueryuiPage.getBackToUI();
   //     jQueryuiPage.getExcel();
    }
}
