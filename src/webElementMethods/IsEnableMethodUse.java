package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethodUse {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
        driver.get("https://www.discoveryplus.in/home");
        Thread.sleep(1000);

      driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
       
       
        Thread.sleep(7000);
        
        //driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
      //  WebElement otpbutton=driver.findElement(By.xpath("//button[text()='Get OTP']"));
        //if(otpbutton.isEnabled())
        	//System.out.println("OTP Button is Enabled");
        //else
        	//System.out.println("OTP Button is not Enabled");
        
        
	}

}
