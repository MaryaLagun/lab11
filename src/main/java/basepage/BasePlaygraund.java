package basepage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class BasePlaygraund {
    protected final String HOME_URL = "http://uitestingplayground.com/";
    public SelenideElement dinamicTableLink = $x("//div[@class='col-sm']/h3/a[text()='Dynamic Table'");
    //  public SelenideElement bussinesAn=$x("//a[text()='Стажировка для бизнес-аналитиков']");

    public void getPage() {
        open(HOME_URL);
    }

    public void getDinamicTable() {
        dinamicTableLink.click();

    }
}
