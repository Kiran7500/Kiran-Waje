package setPositionandSize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/);");
		
		Thread.sleep(1000);
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(1000);
		
		// To set Size, create object of Dimension Class and pass width and Height values   
		Dimension d = new Dimension(2000,1000);
		Thread.sleep(1000);
		
		// using SetSize method we can set size of browser window. 
		driver.manage().window().setSize(d);

	}

}
