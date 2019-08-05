package Mavenpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testng 
{
	@Test
	public void runMethod()
	{
		Reporter.log("Passed");
	}
	
	@Test
	public void runMethod2()
	{
		Reporter.log("failed");
	}

}
