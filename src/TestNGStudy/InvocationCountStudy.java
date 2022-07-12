package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvocationCountStudy {
  @Test(invocationCount=3)
  public void a()
  {
	  Reporter.log("a Method id Running",true);
  }
  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("After Method id Running",true);
  }
}
