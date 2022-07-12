package KiteTestByBaseUtility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import BasePackage.ListnerBaseProp;
import UtilityPackage.PropertiesUtility;

public class Listners extends ListnerBaseProp implements ITestListener
{
	@Override
public void onTestFailure(ITestResult result)
{
	try {
		PropertiesUtility.captureScreenshot(driver, result.getName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
@Override
public void onTestSuccess(ITestResult result)
{
	Reporter.log("TC passed and TC name is "+result.getName(), true); 
}

}
