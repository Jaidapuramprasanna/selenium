package FrameWork_Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Method_Priority
{
  @Test(priority=0)
  public void f() 
  {
	  Reporter.log("f method executed",true);
  }
  
  @Test(priority=1)
  public void c() 
  {
	  Reporter.log("c method executed",true);
  }
  
  @Test(priority=2)
  public void v() 
  {
	  Reporter.log("v method executed",true);
  }
}
