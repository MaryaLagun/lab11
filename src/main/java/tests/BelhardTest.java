package tests;

import basepage.*;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class BelhardTest extends BaseTest {
    BelhardPage belhardPage = new BelhardPage();
  //  @Step
    @Test
    public void belhardTest() {

        belhardPage.getBelhardPage();
        belhardPage.getAnaliticExperience();


    }

}