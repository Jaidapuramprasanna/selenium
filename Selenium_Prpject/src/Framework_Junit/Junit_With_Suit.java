package Framework_Junit;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({My_Junit_Test.class,Webdriver_Junit_Testcase.class})

public class Junit_With_Suit 
{

	@Test
	public void test() {
		//fail("Not yet implemented");
	}

}
