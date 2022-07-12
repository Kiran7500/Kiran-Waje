package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterLog {
  @Test
  public void reporterLog() 
  {
	  Reporter.log("Test Case is Passed",true); 
	  }
}
