package tests;

import basepage.HomePage;
import basepage.HomePageButton;
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

    @Test
    public void locatorTest() {
        homePage.openURL();
        homePage.clickABTestingLink("Add/Remove Elements");
        homePage.addElement(4);
        List<WebElement> actualList=homePage.getDeleteButtonList();
        Assert.assertTrue(actualList.size()==4);
    }
    @Test
    public void addRemoveAllTest(){
        homePage.openURL();
        homePage.clickABTestingLink("Add/Remove Elements");
        homePage.addElement(8);
        List<WebElement> actualList=homePage.getDeleteButtonList();
        Assert.assertTrue(actualList.size()==8);

        for (WebElement element: actualList){
           element.click();
        }
        List<WebElement> afterDelete=homePage.getDeleteButtonList();
        Assert.assertTrue(afterDelete.isEmpty());
    }
}