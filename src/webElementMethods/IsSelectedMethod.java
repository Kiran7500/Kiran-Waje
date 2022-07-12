package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiranwaje\\Desktop\\software testing\\Selenium\\Chrome Driver Extract File\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://vctcpune.com/selenium/practice.html");
        WebElement checkbox=driver.findElement(By.name("checkBoxOption1"));
        
        boolean result=checkbox.isSelected();
        if(result)
        	System.out.println("Checkbox is selected");
        else
        	System.out.println("Checkbox is not selected");
        
        System.out.println("===============");
        
        System.out.println();
        checkbox.click();
        boolean result1=checkbox.isSelected();
        if(result1)
        	System.out.println("Thank You!!! Checkbox is selected Now");
        else
        	System.out.println("Checkbox is not selected");

	}

}
