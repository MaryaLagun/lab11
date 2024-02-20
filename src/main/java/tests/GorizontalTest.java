package tests;

import basepage.GorisontalSliderPage;
import basepage.HomePage;
import org.junit.Test;
import org.testng.Assert;

public class GorizontalTest {
    HomePage homepage=new HomePage();
    GorisontalSliderPage gorisontalSliderPage=new GorisontalSliderPage();
    @Test
    public void scrollTest(){
        homepage.clickABTestingLink("Horizontal Slider");
       gorisontalSliderPage.moveScroller("3");
        String actualRange=gorisontalSliderPage.getRangeValue();
     //   Assert.assertTrue(ass);
    }
}
