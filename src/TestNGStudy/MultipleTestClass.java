package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleTestClass {
  @Test
  public void myMethod() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		System.out.println("Hi this is printing Statement");
		Reporter.log("Hi this is reporter output");
		Reporter.log("Hi this is reporter output true",true);
		
		
  }
  @Test
  public void test2() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		
  }
}
