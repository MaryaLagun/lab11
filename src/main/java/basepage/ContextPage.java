package basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ContextPage extends PageObject{
    protected final String HOME_URL="https://the-internet.herokuapp.com";
    private static String LINK_PATTERN="//ul/li/a[text()='%s']";
    public static final By contextarea=By.xpath("//div[id@='hot-spot']");
    Actions action=new Actions(driver);

    public void openURL(){
        driver.get(HOME_URL);
    }

    public void clickABTestingLink(String linkName)
    {
        driver.findElement(By.xpath(String.format(LINK_PATTERN,linkName))).click();
    }
 public void managerArea(){
        action.contextClick(driver.findElement(contextarea)).build().perform();
 }
public String getAlert(){
      return driver.switchTo().alert().getText();
}
public void confirmAlert(){
        driver.switchTo().alert().accept();
}

    }
