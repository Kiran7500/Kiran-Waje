package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void validateUserName() 
  {
	  Reporter.log("UserName Validated",true);
  }
  @Test
  public void validateDashBoard()
  {
	  Reporter.log("Dashboard validated",true);
  }
  @BeforeMethod
  public void loginToKiteApp()
  {
	  Reporter.log("Login Success",true);
  }
  @AfterMethod
  public void logOutFromKiteApp()
  {
	  Reporter.log("Logged out.....",true);
  }
  @BeforeClass
  public void launchBrowser()
  {
	  Reporter.log("Launching Browser",true);
  }
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Closing Browser",true);
  }
  
}
