package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{
 @FindBy(xpath="//span[@class='user-id']")private WebElement userName;
 @FindBy(xpath="//a[@target='_self']")private WebElement logOutButton;
 
 public KiteHomePage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 public void validateUserName()
 {
	 String expectedUserName = "ELR321";
	 String actualUserName = userName.getText();
	 
	 if(expectedUserName.equals(actualUserName))
	 {
		 System.out.println("Actual and Expected user id are Matching TC is Passed");
	 }
	 else
	 {
		 System.out.println("Actual and Expected user id are not Matching TC is Failed");
		 }
	 }
	 public void logOut() throws InterruptedException
	 {
		 userName.click();
		 Thread.sleep(200);
		 logOutButton.click();
	 
	
	 
 }
}
