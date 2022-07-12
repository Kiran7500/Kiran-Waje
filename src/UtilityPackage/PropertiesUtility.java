package UtilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class PropertiesUtility 
{
public static void captureScreenshot(WebDriver driver,String TCID) throws IOException
{
	   File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       
       File dest=new File("C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Screenshots\\MyScreenshot"+TCID+".png");
       
       FileHandler.copy(source,dest);
       
}
public static String getDataFromPropertyFile(String key) throws IOException
{
	 Properties prop = new Properties();
	 FileInputStream myfile=new FileInputStream("C:\\Users\\kiranwaje\\eclipse-workspace\\Selenium 1st Project\\Kite.properties");
	 prop.load(myfile);
	 String value = prop.getProperty(key);
	 return value;
}
}
