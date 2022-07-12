package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickMethodUse {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		driver.findElement(By.name("checkBoxOption1")).click();	
		
		Thread.sleep(2000);
		//1.   getText method use    
		
	System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]")).getText());	
		
	}

}
