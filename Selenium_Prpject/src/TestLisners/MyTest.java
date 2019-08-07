package TestLisners;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class MyTest 
{
	
  @Test
  public void tc001() 
  {
	  Assert.assertEquals("email","email");
  }
  
  @Test
  public void tc002() 
  {
	  Assert.assertEquals("gmail","google");
	
  }
}
