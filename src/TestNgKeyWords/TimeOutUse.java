package TestNgKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutUse {
  @Test(timeOut=2000)
  public void d() throws InterruptedException 
  {
	  Thread.sleep(3000);
	  Reporter.log("d Method is Running",true);
  }
  @Test
  public void z()
  {
	  Reporter.log("z Method id Running",true);
  }
  @Test
  public void a()
  {
	  Reporter.log("a Method is Running",true);
  }
}
