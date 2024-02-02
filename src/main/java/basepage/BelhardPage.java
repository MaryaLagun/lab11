package basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BelhardPage extends PageObject{
    protected final String HOME_URL="https://belhard.academy/";
    public static final By getWorkExperience=By.xpath("//div/a[@data-tooltip-menu-id='346409565']");
    public static final By bussinesAn=By.xpath("//a[text()='Стажировка для бизнес-аналитиков']");
    Actions action=new Actions(driver);
    WebDriverWait webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(30));
    public void openURL(){
        driver.get(HOME_URL);
    }
    public void getAnaliticExperience(){
        action.moveToElement(driver.findElement(getWorkExperience)).build().perform();
        webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(getWorkExperience)));
        driver.findElement(bussinesAn).click();
    }
}