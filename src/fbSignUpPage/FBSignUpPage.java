package fbSignUpPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignUpPage {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/reg/");
        
        Thread.sleep(1000);
       WebElement day= driver.findElement(By.id("day"));
       WebElement month=driver.findElement(By.id("month"));
       WebElement year=driver.findElement(By.id("year"));
       
       Select s=new Select(day);
       Select d=new Select(month);
       Select p=new Select(year);
       
       s.selectByValue("10");
       Thread.sleep(50);
       
       d.selectByIndex(9);
       Thread.sleep(100);
       
       p.selectByValue("1996");
       Thread.sleep(50);
       
	}

}
