package BasePackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import UtilityPackage.PropertiesUtility;

public class ListnerBaseProp 
{
	 protected static WebDriver driver;
	 public void openBrowser() throws IOException  
	 {   
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		 driver= new ChromeDriver();  
		 driver.get(PropertiesUtility.getDataFromPropertyFile("URL"));
		 }  
}
