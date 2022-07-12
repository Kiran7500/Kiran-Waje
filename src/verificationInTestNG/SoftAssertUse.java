package verificationInTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
  @Test
  public void myMethod() 
  {
	  String a="abc";
	  String b=null;
	  
	  SoftAssert soft = new SoftAssert();
	  soft.assertEquals(a, b,"TC is failed values are not matching");
	  //Reporter.log("TC is passed values are matching",true);
	  
	  soft.assertNotNull(b,"TC is Failed value is null");
	 // Reporter.log("TC is passed value is null",true);
	  
	  soft.assertAll();
  }
}
