package basepage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class GooglePage extends PageObject{
    protected final String HOME_URL="https://www.google.com";
    public SelenideElement union=$x("//textarea[@id='APjFqb']");

    public void getGoogle(){
        open(HOME_URL);
    }

public void setSearch(String search){
        union.setValue(search).pressEnter();
}
}

