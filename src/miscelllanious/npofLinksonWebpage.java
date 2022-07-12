package miscelllanious;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class npofLinksonWebpage {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		Iterator<WebElement> it = links.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		

	}

}
