package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/ ");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		String mainPageID = driver.getWindowHandle();//id of main page
		System.out.println(mainPageID);
		
		System.out.println("===================");
		
		//to open child window
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		//to handle multiple windows /to get multiple IDs
		Set<String> allPageIDs = driver.getWindowHandles();
		Iterator<String> it = allPageIDs.iterator();
		
		//while(it.hasNext())
		//{
			//System.out.println(it.next());
		//}
		String mainPageID1=it.next();//will return to main page id
		String childPageID = it.next();//will return to child page
		
		//to switch focus to child windows
		driver.switchTo().window(childPageID);
		driver.manage().window().maximize();
		driver.findElement(By.id("the7-search")).sendKeys("Selenium");
		
		//driver.close();
		//driver.quit();
		
		driver.switchTo().window(mainPageID1);
		
		WebElement text = driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
		System.out.println(text.getText());
	}

}
