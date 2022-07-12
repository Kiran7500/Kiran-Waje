package verificationInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsUse {
  @Test
  public void myMethod() 
  {
	  String a="Pune";
	  String b="Pune";
	  
	  Assert.assertEquals(a,b,"Actual and Expected are not Equal");
  }
}
