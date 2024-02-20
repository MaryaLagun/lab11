package basepage;

import com.codeborne.selenide.SelenideElement;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class ContextPage extends HomePage{
    protected final String HOME_URL="https://the-internet.herokuapp.com";
    private static String LINK_PATTERN="//ul/li/a[text()='%s']";
    public SelenideElement contextarea=$x("//div[id@='hot-spot']");
   // Actions action=new Actions(driver);

    public void openURL(){
        open(HOME_URL);
    }

    public void clickABTestingLink(String linkName)
    {
        $x(String.format(LINK_PATTERN,linkName)).click();
    }
 public void managerArea(){
       contextarea.contextClick();
 }
public String getAlert(){
     return WebDriverRunner.getWebDriver().switchTo().alert().getText();
}
public void confirmAlert(){
       WebDriverRunner.getWebDriver().switchTo().alert().accept();
}

    }
