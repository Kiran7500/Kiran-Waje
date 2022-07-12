package BasePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class KiteBase 
{
	protected WebDriver driver;
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		
		//I dont Want Notification
		//opt.addArguments("--disable-notifications");
		//opt.addArguments("--headless");
		//opt.addArguments("--incognito");
		
		driver=new ChromeDriver(opt);
		
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Reporter.log("Launching Browser",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
	}

}
