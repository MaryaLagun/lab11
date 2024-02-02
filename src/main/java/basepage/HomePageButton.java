package basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageButton extends PageObject{
    protected final String HOME_URL="https://the-internet.herokuapp.com";
    private static String LINK_PATTERN="//ul/li/a[text()='%s']";
    public static final By wbaddButton=By.xpath("//div[@class='example']/button[@onclick='addElement()']");
    public static final By wbdeleteButton=By.xpath("//div[@id='elements']/button");
    public void openURL(){
        driver.get(HOME_URL);
    }

    public void clickABTestingLink(String linkName)
    {
        driver.findElement(By.xpath(String.format(LINK_PATTERN,linkName))).click();
    }

    public void addElement(int clickcount) {
        for (int i = 0;i<clickcount; i++) {
            driver.findElement(wbaddButton).click();
        }
    }
    public List<WebElement> getDeleteButtonList()
    {
        return driver.findElements(wbdeleteButton);
    }
}