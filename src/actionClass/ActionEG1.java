package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEG1 {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
		 //1. create object of Actions class and pass WebDriver object
		Actions act = new Actions(driver);
		
		//2.identify Element where Actions to be perform 
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		//3. using Actions class methods perform desired operation (Context click/RightClick) 
		
		//1st method
		//act.moveToElement(rightClickButton).perform();
		//move mouse to desired location
		//act.contextClick().perform();
		//performed right click operation
		
		//2nd method
		///act.moveToElement(rightClickButton).contextClick().build().perform();
		
		//3rd method
		//act.contextClick(rightClickButton).perform();
		
		   WebElement SeleniumButton = driver.findElement(By.linkText("Selenium")); 
		   act.click(SeleniumButton).perform();
		   
		   WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']")); 
		   act.doubleClick(doubleClickButton).perform();
		
		
		
		
		
		
		
		
		
		

	}

}
