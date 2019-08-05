package Framework_Testng_BeforeTest_and_AfterTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Test_for_chrome 
{
	
  @Test
  public void login() 
  {
	  System.out.println("login sucessfully");
  }
  
  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("pretest before lunch chrome");
 
  }

  @AfterClass
  public void afterClass()
  {
	  System.out.println("post after lunch chrome");

  }

}
