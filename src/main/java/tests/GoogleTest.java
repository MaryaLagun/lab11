package tests;

import basepage.*;
import io.qameta.allure.Allure;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;

import java.io.ByteArrayInputStream;
import java.util.List;

public class GoogleTest extends BaseTest {
    GooglePage googlePage = new GooglePage();

    @Test
    public void googlesTest() {

        googlePage.getGoogle();
        googlePage.setSearch("уточка"+ Keys.ENTER);

        BaseTest.takeScreen();

    }

}
