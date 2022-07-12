package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotEG1 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
        
        File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        File dest=new File("C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Screenshots\\MyScreenshot.png");
        
        FileHandler.copy(source,dest);


	}

}
