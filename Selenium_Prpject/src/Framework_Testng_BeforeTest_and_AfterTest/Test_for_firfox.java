package Framework_Testng_BeforeTest_and_AfterTest;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

public class Test_for_firfox
{
	
 @AfterClass
  public void afterClass() 
  {
	 System.out.println("pretest after lunch firfox");
  }

}
