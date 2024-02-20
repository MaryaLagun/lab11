package tests;

import basepage.BasePlaygraund;
import basepage.DinamicTableContextPage;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;



public class DynamicTableTest extends BaseTest {
    public SelenideElement dinamicTableLink = $x("//div[@class='col-sm']/h3/a[text()='Dynamic Table'");
    BasePlaygraund basePlaygraund=new BasePlaygraund();
    DynamicTableTest dynamicTableTest=new DynamicTableTest();
    DinamicTableContextPage dinamicTableContextPage =new DinamicTableContextPage();
    @Test
    public void tableTest(){
 // open("http://uitestingplayground.com/");
  //   dinamicTableLink.click();
   //  String expected=dinamicTableContextPage.detSearchValue();
  //   String actual=dinamicTableContextPage.getCPUValue(dinamicTableContextPage.getHeadersIndex());
    //    Assert.assertEquals(actual,expected);

    }
}
