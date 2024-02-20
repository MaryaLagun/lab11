package basepage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class JQueryUIPage extends HomePage{
   SelenideElement disablelink=$x("//ul/li[@id='ui-id-1']");
   SelenideElement enablelink=$x("//ul/li[@id='ui-id-3']");
    SelenideElement dowloadlink=$x("//ul/li[@id='ui-id-4']");
    SelenideElement backlink=$x("//ul/li[@id='ui-id-8']");
    SelenideElement dowloadExcel=$x("//ul/li[@id='ui-id-7']");
    SelenideElement pageHeader=$x("//h3");
    SelenideElement menulink=$x("//ul/a[text='Menu']");


@Step("Переход по ссылке")
    public void getBackToUI() throws InterruptedException {
    enablelink.hover();
    backlink.shouldBe(Condition.visible).click();

}
//
 @Step("Проверка заголовка")
public boolean isHeaderExist(){
        return pageHeader.exists();
}
@Step("Возврат на стартовую страницу")
public void backToSource(){
        menulink.shouldBe(Condition.visible).click();
}
    @Step("Скачать отчет exel")
public void getExcel(){
        enablelink.hover();
        disablelink.shouldBe(Condition.visible).hover();
        dowloadExcel.shouldBe(Condition.visible).click();

}


}
