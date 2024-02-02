package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static basepage.PageObject.setDriver;
 abstract public class BaseTest {
    protected static WebDriver driver;

  @BeforeClass
  public static void initDriver() {
   //   String browserName = null;
      if (driver == null) {
          //  browserName=System.getProperty("driver","chrome");
          //    switch (browserName) {
          //      case "chrome":
          //         WebDriverManager.chromedriver().setup();
          //         driver = new ChromeDriver();
          //         break;

          //    case "firefox":
          //    WebDriverManager.firefoxdriver().setup();
          //    driver = new FirefoxDriver();
          //    break;
          //   case "edge":
          //      WebDriverManager.edgedriver().setup();
          //      driver = new EdgeDriver();
          //      break;
          System.setProperty("webdriver.chrome.driver", "d:\\java\\test_sel\\src\\main\\resources\\chromedriver.exe");
          driver = new ChromeDriver();
          setDriver(driver);
      }
          // driver.get("https://the-internet.herokuapp.com/abtest");
          //     return driver;
          //    } else {
   //   } else
      //    return driver;
          //  }
  }
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
}