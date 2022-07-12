package kiteApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteUserIdTest {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		WebElement userid = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		userid.sendKeys("ELR321");
		password.sendKeys("Dhana1111");
		login.click();
		
		Thread.sleep(1000);
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement continuebutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys("982278");
		continuebutton.click();
		
		Thread.sleep(2000);
		
		WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualUserName = userName.getText();
		String expectedUserName = "ELR321";
		
		if(actualUserName.equals(expectedUserName))
		{
			System.out.println("User ID is Matching TC is Passed");
		}
		else
		{
			System.out.println("User ID is not Matching TC is Failed");
		}
		userName.click();
		Thread.sleep(200);
		
		driver.findElement(By.xpath("//a[@target='_self']")).click();  
		Thread.sleep(2000);   
		driver.close(); 
		
		
		
		
		
		
		
		
		
		
		
	}

}
