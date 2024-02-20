package basepage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class BelhardPage extends HomePage{
    protected final String HOME_URL="https://belhard.academy/";
    public SelenideElement getWorkExperience=$x("//div/a[@data-tooltip-menu-id='346409565']");
    public SelenideElement bussinesAn=$x("//a[text()='Стажировка для бизнес-аналитиков']");

   public void getBelhardPage(){
       open(HOME_URL);
   }

    public void getAnaliticExperience(){

       getWorkExperience.hover();
       bussinesAn.shouldBe(Condition.visible,Duration.ofSeconds(30)).click();

    }
}