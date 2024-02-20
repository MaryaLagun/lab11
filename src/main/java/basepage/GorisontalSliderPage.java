package basepage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;

import static com.codeborne.selenide.Selenide.$x;

public class GorisontalSliderPage {
    SelenideElement scroller=$x("//input[@type='range']");
    SelenideElement randeValue=$x("//span[@id='range']");

    public void moveScroller(String scrollerTo){
        while (!randeValue.getText().equals(scrollerTo)) {
            scroller.sendKeys(Keys.ARROW_RIGHT);
        }

    }
    public String getRangeValue(){
        return randeValue.getText();
    }
}
