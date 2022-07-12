package verificationInTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssert {
  @Test
  public void myMethod() 
  {
	  String a="abc";
	  String b="abc";
	  
	  Assert.assertEquals(a,b,"Values are not equal TC is failed");
	  Reporter.log("values are equal TC is Passed",true);
	  
	  //Assert.assertNull(a,"Value is not null");    
	  //Reporter.log("Value is null TC passed",true); 
  }
}
