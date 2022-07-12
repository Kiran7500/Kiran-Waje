package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My1stSeleniumCode {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://vctcpune.com/");
	    driver.close();
	    driver.quit();
	}

}
