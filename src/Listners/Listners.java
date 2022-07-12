package Listners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listners implements ITestListener
{
   @Override
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("TC Passed Successfully",true);
		result.getName();
		Reporter.log("Name of Test method completed suceess is "+result.getName(),true); 
	}
   @Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("Test Case Failed please check again",true);
		Reporter.log("Name of Test method failed is "+result.getName(),true);  
		 
	}
   @Override
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("test case skipped, please check dependant method",true); 
		Reporter.log("Name of Test method skipped is "+result.getName(),true); 
	}
}
