package basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageObject{
    protected final String HOME_URL="https://the-internet.herokuapp.com";
    private static String LINK_PATTERN="//ul/li/a[text()='%s']";
  //  public static final By wbTestingLink=By.xpath("//ul/li/a[text()='%s']");
    public void openURL(){
        driver.get(HOME_URL);
    }
    public void clickABTestingLink(String linkName)
    {
        driver.findElement(By.xpath(String.format(LINK_PATTERN,linkName))).click();
    }

   // WebDriver driver;
  //  private  String homeURL="https://the-internet.herokuapp.com/";
 //   private static String LINK_PATTERN="//ul/li/a[text()='%s']";
  //  public void clickLink(String linkName)
  //  {
  //      driver.findElements(By.xpath(String.format(LINK_PATTERN,linkName))).click();
   // }
 //   public HomePage(WebDriver driver){
 //       this.driver=driver;
  //  }
}
