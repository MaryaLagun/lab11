package basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class GooglePage extends PageObject{
    protected final String HOME_URL="https://www.google.com";
    public static final By union=By.xpath("//textarea[@id='APjFqb']");

    public void openURL(){
        driver.get(HOME_URL);
    }
public void setSearch(String search){
        driver.findElement(union).sendKeys(search);
}
}

