package Listners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listners.class)
public class MyTest {
  @Test
  public void myMethod1() 
  {
	  Reporter.log("myMethod 1 is Running",true); 
  }
  @Test
  public void myMethod2()
  {
	  Assert.fail();
	  Reporter.log("MyMethod 2 is Running",true);
  }
  @Test(dependsOnMethods={"myMethod2"})
  public void myMethod3()
  {
	  Reporter.log("MyMethod3 is Running",true);
  }
  
}
