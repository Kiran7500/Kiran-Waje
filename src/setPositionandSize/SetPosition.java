package setPositionandSize;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/);");
		
		Thread.sleep(1000);
		System.out.println(driver.manage().window().getPosition());
		Thread.sleep(1000);
		
		// To set Position of browser, create object of Point class and pass X and Y values 
		Point p = new Point(50,30);
		
		// Using setPostion method we can set Position of browser 
		driver.manage().window().setPosition(p);

	}

}
