package verificationInTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullUse {
  @Test
  public void myMethod() 
  {
	  String a=null;
	  String b="abc";
	  
	  //if text is null then Tc is passed    
	   // Assert.assertNull(b, "TC is failed value is not null"); 
	  //  Reporter.log("TC is passed value is null", true); 
	    
	    Assert.assertNotNull(b, "TC is failed value is null");
	    Reporter.log("TC is passed value is not null",true);
  }
}
