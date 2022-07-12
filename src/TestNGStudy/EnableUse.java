package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableUse {
  @Test
  public void a() 
  {
	  Reporter.log("Method a is running",true);
  }
  @Test(enabled=false)
  public void b()
  {
	  Reporter.log("Method b is running",true);
  }
  @Test
  public void c()
  {
	  Reporter.log("Method c is running",true);
  }
}
