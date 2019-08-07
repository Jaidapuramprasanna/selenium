package FrameWork_Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BeforeClass_And_AfterClass 
{
  @Test
  public void test1() 
  {
	  Reporter.log("test1 executed");
  }
  
  @Test
  public void test2() 
  {
	  Reporter.log("test2 executed");
  }
  
  @Test
  public void test3() 
  {
	  Reporter.log("test3 executed");
  }
  
  
  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("browser initiation");
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("browser terminated");
  }

}
