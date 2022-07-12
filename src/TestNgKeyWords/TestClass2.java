package TestNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass2 {
  @Test
  public void x() 
  {
	  Reporter.log("x is Running",true);
  }
  @Test
  public void y()
  {
	  Reporter.log("y is Running",true);
  }
  @Test
  public void z()
  {
	  Reporter.log("z is Running",true);
  }
}
