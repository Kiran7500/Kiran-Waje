package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollinginSelenium {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1000);
        
      //Normal scrolling 
         // JavascriptExecutor e = (JavascriptExecutor)driver; 
         // e.executeScript("window.scrollBy(90,799)");         
        //ScrollIntoView 
        
        WebElement mouse = driver.findElement(By.id("mousehover"));
        JavascriptExecutor e = (JavascriptExecutor)driver;
        e.executeScript("arguments[0].scrollIntoView(true)",mouse); 

	}

}
