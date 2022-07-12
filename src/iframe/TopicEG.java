package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TopicEG {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        Thread.sleep(1000);
        
        driver.switchTo().frame("frame1");
        
        driver.findElement(By.xpath("/html/body/input")).sendKeys("Selenium");
        
        driver.switchTo().frame("frame3");
        driver.findElement(By.id("a")).click();
        
        driver.switchTo().defaultContent();
        WebElement ss=driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']"));
        System.out.println(ss.getText());
        
        driver.switchTo().frame("frame2");
        WebElement animal=driver.findElement(By.id("animals"));
        
        Select q=new Select(animal);
       q.selectByIndex(2);
       q.selectByVisibleText("Avatar");
       

	}

}
