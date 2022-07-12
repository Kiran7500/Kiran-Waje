package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(1000));
          WebElement mouse = driver.findElement(By.id("mousehover"));
          wait.until(ExpectedConditions.visibilityOf(mouse)); 

	}

}
