package KiteTestByBaseUtility;

import org.testng.annotations.Test;

import BasePackage.PropertiesBase;
import KiteAppPOMandExcel.KiteHomePage;
import KiteAppPOMandExcel.KiteLoginPage;
import KiteAppPOMandExcel.KitePinPage;
import UtilityPackage.PropertiesUtility;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class KiteTestProperties extends PropertiesBase
{
	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
	String TCID="557";
	
	
	
	
  @Test
  public void validateUserID() throws IOException
  {
	  Assert.assertEquals(home.validateUID(),PropertiesUtility.getDataFromPropertyFile("UN"),"TC Failed");
	  Reporter.log("TC Passed",true);
	  PropertiesUtility.captureScreenshot(driver, TCID);
  }
  @BeforeMethod
  public void loginToKiteApp() throws IOException, InterruptedException 
  {
	  login.sendUserName(PropertiesUtility.getDataFromPropertyFile("UN"));
	  login.sendPassword(PropertiesUtility.getDataFromPropertyFile("PWD"));
	  login.clickOnLoginButton();
	  Thread.sleep(3000);
	  pin.sendPin(PropertiesUtility.getDataFromPropertyFile("PIN"));
	  pin.clickOnContinueButton();
	  Thread.sleep(3000);
  }

  @AfterMethod
  public void logOutFromKite() throws InterruptedException 
  {
	  home.logOut();
  }

  @BeforeClass
  public void launchbrowser() throws IOException  
  {
	  openBrowser();
	  login=new KiteLoginPage(driver);
	  pin=new KitePinPage(driver);
	  home=new KiteHomePage(driver);
  }

  @AfterClass
  public void closeBrowser()
  {
	  driver.close();  
	  }

}
