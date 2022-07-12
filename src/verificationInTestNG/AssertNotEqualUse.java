package verificationInTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotEqualUse {
  @Test
  public void myMethod() 
  {
	  String a="Pune";
	  String b="pune";
	  
	  //Assert.assertEquals(a, b,"actual and expected are not equal"); 
	  Assert.assertNotEquals(a, b,"Actual and Expected are Equal");
	  Reporter.log("Actual and Expected are not Equal TC is Passed",true);
  }
}
