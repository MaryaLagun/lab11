package basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxes extends PageObject{
    protected final String HOME_URL="https://the-internet.herokuapp.com";
    private static String LINK_PATTERN="//ul/li/a[text()='%s']";
    public static final By wbcheckbox1=By.xpath("//form[@id='checkboxes']/input[1]");
    public static final By wbcheckbox2=By.xpath("//form[@id='checkboxes']/input[1]");
    By allCheckBoxes=By.xpath("//form[@id='checkboxes']/input");
    public void openURL(){
        driver.get(HOME_URL);
    }

    public void clickABTestingLink(String linkName)
    {
        driver.findElement(By.xpath(String.format(LINK_PATTERN,linkName))).click();
    }

    public void  managerCheckbox(By checkbox) {
            driver.findElement(checkbox).click();
    }
 public boolean isCheck(By checkbox){
     return driver.findElement(checkbox).isSelected();

 }
 public void selectedAll(){
      List<WebElement>  checkboxes=driver.findElements(allCheckBoxes);
      for (WebElement element:checkboxes){
          if (!element.isSelected())
      {
             element.click();
          }
      }
 }

    public void unselectedAll(){
        List<WebElement>  checkboxes=driver.findElements(allCheckBoxes);
        for (WebElement element:checkboxes){
            if (element.isSelected()){
                element.click();
            }
        }
    }
}