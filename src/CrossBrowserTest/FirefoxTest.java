package CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxTest {
  @Test
  public void myMethod() 
  {
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\geckodriver.exe");
	 WebDriver driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	  
	  
  }
}
