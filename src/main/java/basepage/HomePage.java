package basepage;


import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {
     private String HOME_URL="https://the-internet.herokuapp.com";
     private static String LINK_PATTERN="//ul/li/a[text()='%s']";
     @Step("Переход по ссылке")
  public void initDriver(){
    open(HOME_URL);
}
    public void clickABTestingLink(String linkName)
    {
        $x(String.format(LINK_PATTERN,linkName)).click();
    }

}
