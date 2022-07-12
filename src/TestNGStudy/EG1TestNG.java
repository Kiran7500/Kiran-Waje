package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EG1TestNG {
  @Test
  public void KiteLogin() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
  }
}
