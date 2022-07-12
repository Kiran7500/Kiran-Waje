package BasePackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import UtilityPackage.PropertiesUtility;

public class PropertiesBase
{
  protected WebDriver driver;
  public void openBrowser() throws IOException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
	  ChromeOptions opt = new ChromeOptions();
	  opt.addArguments("--disable-notifications");
	  driver=new ChromeDriver(opt);
	  driver.manage().window().maximize();
	  driver.get(PropertiesUtility.getDataFromPropertyFile("URL"));
	  Reporter.log("Launching Browser",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  
  }
}
