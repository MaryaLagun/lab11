package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.ByteArrayInputStream;

import static com.codeborne.selenide.Selenide.open;

abstract public class BaseTest {
    //   protected static WebDriver driver;
    @BeforeClass
    public void initDriver() {
        open("https://the-internet.herokuapp.com");
    }


    public static void takeScreen() {
        byte[] screen = Selenide.screenshot(OutputType.BYTES);
        if (screen != null) {
            //  Allure.addAttachment();
            Allure.addAttachment("pagescreen", "image/png", String.valueOf(new ByteArrayInputStream(screen)),".png");
        }
    }

    public static byte[] takeScreenShot() {
        return ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);

    }

 //   @BeforeMethod
 //   @Step("Инициализация драйвера")
   // public static void initDriver2() {
     //   String browserName = null;
     //   if (driver == null) {
      //      browserName = System.getProperty("driver", "chrome");
       //     switch (browserName) {
        //        case "chrome":
         //           Configuration.browser = "chrome";
                    //         WebDriverManager.chromedriver().setup();
                    //         driver = new ChromeDriver();
           //         break;

         //       case "firefox":
            //        Configuration.browser = "firefox";
                    //    WebDriverManager.firefoxdriver().setup();
                    //    driver = new FirefoxDriver();
               //     break;
       //         case "ie":
             //       Configuration.browser = "ie";
                    //      WebDriverManager.edgedriver().setup();
                    //      driver = new EdgeDriver();
           //         break;
                //       System.setProperty("webdriver.chrome.driver", "d:\\java\\test_sel\\src\\main\\resources\\chromedriver.exe");
                //       driver = new ChromeDriver();
                //       setDriver(driver);
      //      }
            //  open(getFromProperties("base_url"));
    //        WebDriverRunner.getWebDriver().manage().window().maximize();
    //    }
    //    public void test() {
      //     ChromeOptions chromeOptions=new ChromeOptions();
      //      chromeOptions.setCapability("headless","true");
     //       WebDriver driver=new ChromeDriver(chromeOptions);
     //       WebDriverRunner.setWebDriver(driver);
     //   }
        // driver.get("https://the-internet.herokuapp.com/abtest");
        //     return driver;
        //    } else {
        //   } else
        //    return driver;
        //  }
        // }
        //private static ChromeOptions getOptions(){
        //  ChromeOptions options=new ChromeOptions();
        // System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/windows/chromedriver.exe");
        //   ChromeOptions options = new ChromeOptions();
        //   options.addArguments("--remote-allow-origins=*");
        //   options.addArguments("--ignore-ssl-errors=yes");
        //   options.addArguments("--ignore-certificate-errors");
        //  options.addArguments("--start-maximized");
        //   options.addArguments("--no-sandbox");
        //    options.addArguments("--whitelisted-ips");
        //   return options;
        // }
        //   @AfterClass
        //   public void tearDown(){
        //     driver.quit();
        //   }
  //  }
}