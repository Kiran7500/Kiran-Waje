package TestNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass3 {
  @Test(groups="regression")
  public void x() 
  {
	  Reporter.log("x is Running",true);
  }
  @Test(groups="regression")
  public void y()
  {
	  Reporter.log("y is Running",true);
  }
  @Test(groups="sanity")
  public void z()
  {
	  Reporter.log("z is Running",true);
  }
  
}
