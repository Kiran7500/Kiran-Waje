package TestNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsonMethodUse {
  @Test
  public void d() 
  {
	  Reporter.log("d Method is Running",true);
  }
  @Test
  public void z()
  {
	  Reporter.log("z Method is Running",true);
  }
  @Test(dependsOnMethods={"z","d"},priority=-3)
  public void a()
  {
	  Reporter.log("a Method is Running",true);
  }
}
