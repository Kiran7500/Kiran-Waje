package SerialandParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass1 {
  @Test
  public void myMethod() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		Reporter.log("MyMethod is Rinning",true);
		Thread.sleep(1000);
  }
}
