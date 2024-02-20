package basepage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class DinamicTableContextPage {

    SelenideElement valueToCheck=$x("//p[@class='bg-warning']");
    ElementsCollection header=$$x("//span[@role='columnheader']");
    SelenideElement rows=$x("//span[@role='cell' and text()='Chrome']/..");

    public String detSearchValue(){
        String initial=valueToCheck.getText();
        return initial.split(" ")[2];

    }
    public int getHeadersIndex(){
     //   List<String> headerValue=header.attributes("value");
      List<WebElement> elementList= WebDriverRunner.getWebDriver().findElements(By.xpath("//span[@role='columnheader']"));
               int index=0;
                for (int i=0;i<elementList.size()-1;i++){
                    if (elementList.get(i).getText().equals("CPU")) {
                        index=i;
                    }
                }
                return index;

    }
    public String getCPUValue(int index){
      return rows.$x(String.format("./span[%s]",String.valueOf(index))).getText();
    }
}
