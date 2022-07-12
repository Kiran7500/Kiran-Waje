package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		// how to send keys using Actions class 
		//1.Find Elements
		WebElement textBox = driver.findElement(By.id("autocomplete"));
		
		//2.create object of action class
	Actions act = new Actions(driver);
	
	//3. take action     
	act.sendKeys(textBox, "Welcome").perform(); 
	
	// KeyBoard Action up-Down keys      
	WebElement listBox = driver.findElement(By.name("dropdown-classexample"));   
		
	act.click(listBox).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();     
		
		
		
		
		
		
		
		
		
		

	}

}
