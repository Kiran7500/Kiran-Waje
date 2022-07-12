package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class WebDriverMethods {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//1. get-->to enter url in browser or to open an application
		driver.get("https://vctcpune.com/");
		
		//2.close-->to close the current tab of the browser opened by Selenium 
		//driver.close();
		
		//3.quit: to close the all the tabs present in browser opened by Selenium 
		//driver.quit();
		
		//4. maximize/ minimize() - used to maximize/ minimize the browser 
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
		//5. navigate: this method is use to open an application, move forward, backward & refresh the webpage. 
		//driver.navigate().to("https://vctcpune.com/");
		
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		//6. getTitle: this method is use to get title of a webpage. return type of getTitle method is String. 
		System.out.println(driver.getTitle());
		
		String result=driver.getTitle();
		System.out.println("Title of Webpage is "+result);
		
		//7. getCurrentURL: this method is use to get URL of a webpage. return type of getCurrentURL method is String 
		System.out.println(driver.getCurrentUrl());
		
		String url=driver.getCurrentUrl();
		System.out.println("URL of webpage is "+url);
		
		

	}

}
