package basepage;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class HomePageButton {
    protected final String HOME_URL="https://the-internet.herokuapp.com";
    private static String LINK_PATTERN="//ul/li/a[text()='%s']";
    private SelenideElement wbaddButton=$x("//div[@class='example']/button[@onclick='addElement()']");
    private ElementsCollection wbdeleteButton=$$x("//div[@id='elements']/button");
    public void openURL(){
       open(HOME_URL);
    }
@Step("xo-xo-xo")
   public void clickABTestingLink(String linkName)
   {
    $x(String.format(LINK_PATTERN,linkName)).click();
   }
@Step("gggggg ggggg")
    public void addElement(int clickcount) {
        for (int i = 0;i<clickcount; i++) {
            wbaddButton.click();
        }
    }
    public ElementsCollection getDeleteButtonList()
    {
      return $$x("//div[@id='elements']/button");
    }
}