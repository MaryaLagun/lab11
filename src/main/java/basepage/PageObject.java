package basepage;

import org.openqa.selenium.WebDriver;

public class PageObject {

    protected static WebDriver driver;
    public static void setDriver(WebDriver webDriver){
        driver=webDriver;
    }
}