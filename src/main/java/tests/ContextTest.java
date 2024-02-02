package tests;

import basepage.CheckBoxes;
import basepage.ContextPage;
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

public class ContextTest extends BaseTest {
    private static final String EXPECTED_URL = "https://the-internet.herokuapp.com/";
    ContextPage contextPage = new ContextPage();
    private static final String EXPECTED_TEXT="You selected a context menu";
    @Test
    public void contextTest() {

        contextPage.openURL();
        contextPage.clickABTestingLink("Context Menu");
        contextPage.managerArea();
        String alertText=contextPage.getAlert();
        contextPage.confirmAlert();
        Assert.assertEquals(alertText,EXPECTED_TEXT);

    }

}
