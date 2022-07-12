package miscelllanious;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class unorderedList {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(500);
		
		List<WebElement> searchResult = driver.findElements(By.xpath("(//ul[@role='listbox'])[1]//li"));
	     System.out.println(searchResult.size());
	     for(WebElement r:searchResult)
	     {
	    	 System.out.println(r.getText());
	     }
	     for(WebElement result:searchResult)
	     {
	    	 String actualText = result.getText();
	    			 String expectedText = "honda amaze";
	    			 if(actualText.equals(expectedText))
	    			 {
	    				 result.click();
	    				 break;
	    			 }
	    			 
	     }

	}

}
