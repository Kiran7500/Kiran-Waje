package KiteAppPOMandExcel;

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
	 public void validateUserID(String ExpUserID)
	 {
		 String actualuserName = userName.getText();
		 String expectedUserID = ExpUserID;
		 
		 if(actualuserName.equals(expectedUserID))
		 {
			 System.out.println("Actual and Expected user id are Matching TC is Passed");
		 }
		 else
		 {
			 System.out.println("Actual and Expected user id are not Matching TC is Failed");
			 }
		 }
	 //This is For Validating KitePom in TestNG class
	 public String validateUID()
	 {
		String value = userName.getText();
		return value;
		 
	 }
		 public void logOut() throws InterruptedException
		 {
			 userName.click();
			 Thread.sleep(200);
			 logOutButton.click();
		 
		
		 
	 }
}
