package tests;

import basepage.CheckBoxes;
import basepage.HomePage;
import basepage.HomePageButton;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class CheckBoxTest extends BaseTest {
    private static final String EXPECTED_URL = "https://the-internet.herokuapp.com/";
    CheckBoxes checkPage = new CheckBoxes();

    @Test
    public void checkTest() {
        checkPage.openURL();
        checkPage.clickABTestingLink("Checkboxes");
      boolean initialState1=checkPage.isCheck(CheckBoxes.wbcheckbox1);
      boolean initialState2=checkPage.isCheck(CheckBoxes.wbcheckbox2);
      checkPage.managerCheckbox(CheckBoxes.wbcheckbox1);
        boolean actionState1=checkPage.isCheck(CheckBoxes.wbcheckbox1);
        boolean actionlState2=checkPage.isCheck(CheckBoxes.wbcheckbox2);
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertFalse(initialState1);
        softAssert.assertTrue(initialState2);
        softAssert.assertTrue(actionState1);
        softAssert.assertTrue(actionlState2);


checkPage.selectedAll();
checkPage.unselectedAll();

        softAssert.assertAll();
    }

}