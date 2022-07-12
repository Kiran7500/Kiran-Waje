package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Cars");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).clear();
		
		//Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("BMW");
		//Thread.sleep(1000);
     driver.findElement(By.xpath("//input[@title='Search']")).click();
		
		driver.findElement(By.xpath("//img[@class='rg_i Q4LuWd']")).click();
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@data-atf='true'])[2]")).click();

	}

}
