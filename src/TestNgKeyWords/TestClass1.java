package TestNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 {
  @Test
  public void p() 
  {
	  Reporter.log("p Method is Running",true);
  }
  @Test
  public void q()
  {
	  Reporter.log("q Method id Running",true);
  }
  @Test
  public void r()
  {
	  Reporter.log("r Method is Running",true);
  }
}
