package basepage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CheckBoxes extends HomePage {
  //  protected final String HOME_URL="https://the-internet.herokuapp.com";
  //  private static String LINK_PATTERN="//ul/li/a[text()='%s']";
    public SelenideElement wbcheckbox1=$x("//form[@id='checkboxes']/input[1]");
    public SelenideElement wbcheckbox2=$x("//form[@id='checkboxes']/input[1]");
    ElementsCollection allCheckBoxes=$$x("//form[@id='checkboxes']/input");
  // public void openURL(){driver.get(HOME_URL);
   // }

//   public void clickABTestingLink(String linkName)
  //  {
   //    $x(String.format(LINK_PATTERN,linkName)).click();
   // }

    public void  managerCheckbox(SelenideElement checkbox) {
           checkbox.click();
    }
 public boolean isCheck(SelenideElement checkbox){
     return checkbox.isSelected();
    }

    public void selectedAll(){
      allCheckBoxes.iterator().forEachRemaining(element->{
        if (!element.isSelected())
           {
                 element.click();
      }});
    }
  public void unselectedAll(){
    allCheckBoxes.iterator().forEachRemaining(element->{
      if (element.isSelected())
      {
        element.click();
      }});
  }
}