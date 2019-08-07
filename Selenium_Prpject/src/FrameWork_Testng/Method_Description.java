package FrameWork_Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Method_Description 
{
  @Test(description="verifying login with valid data",priority=0)
  public void method1()
  {
	  Reporter.log("method1 executed");
  }
  
  @Test(description="verifying login with invalid data",priority=1)
  public void method2()
  {
	  Reporter.log("method2 executed");
  }
  @Test
  public void verify_login_without_data()
  {
	  Reporter.log("method3 executed");
  }
}
