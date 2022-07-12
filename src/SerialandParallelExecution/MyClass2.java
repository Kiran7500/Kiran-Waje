package SerialandParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass2 {
  @Test
  public void myMethod1() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.google.co.in/");
			Reporter.log("MyMethod is Running",true);
			Thread.sleep(1000);
  }
}
