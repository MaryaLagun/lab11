package tests;

import basepage.HomePage;
import basepage.HomePageButton;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import jdk.jfr.Description;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import java.util.List;

public class ButtonTest extends BaseTest {
    private static final String EXPECTED_URL = "https://the-internet.herokuapp.com/";
    HomePageButton homePage = new HomePageButton();
Logger log= LogManager.getLogger(ButtonTest.class);
    @Test
    @Description("Добавление")
    @Epic("Epicccc")
    @Feature("alarm!!!")
    public void locatorTest() {
       log.info("test1");
        homePage.openURL();
        homePage.clickABTestingLink("Add/Remove Elements");
      homePage.addElement(4);
       ElementsCollection actualList=homePage.getDeleteButtonList();
        Assert.assertTrue(actualList.size()==4);
    }
    @Test
    public void addRemoveAllTest(){
        homePage.openURL();
        homePage.clickABTestingLink("Add/Remove Elements");
        homePage.addElement(8);
        ElementsCollection actualList=homePage.getDeleteButtonList();
        Assert.assertTrue(actualList.size()==8);

        for (WebElement element: actualList){
           element.click();
        }
        ElementsCollection afterDelete=homePage.getDeleteButtonList();
        Assert.assertTrue(afterDelete.isEmpty());
    }
}