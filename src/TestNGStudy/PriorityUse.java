package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse {
  @Test(priority=1)
  public void d() 
  {
	  Reporter.log("Method d is running",true);
  }
  @Test(priority=2)
  public void z()
  {
	  Reporter.log("Method z is running",true);
  }
  @Test(priority=2)
  public void a()
  {
	  Reporter.log("Method a is running",true);
  }
}
