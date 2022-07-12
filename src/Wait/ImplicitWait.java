package Wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        

	}

}
