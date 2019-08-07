package FrameWork_Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Method_Ignore 
{
  @Test
  public void tc001()
  {
	  Reporter.log("tc001 executed");
  }
  
  @Test(enabled=true)
  public void tc002()
  {
	  Reporter.log("tc002 executed");
  }
  
  @Test(enabled=true)
  public void tc003()
  {
	  Reporter.log("tc003 executed",true);
  }
}
