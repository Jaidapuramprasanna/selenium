package Framework_Junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Before_And_After {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("setUpBeforeClass");
    }

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("tearDownAfterClass");

	}

	@Before
	public void setUp() throws Exception 
	{
		System.out.println("pre-condition");
	}

	@After
	public void tearDown() throws Exception 
	{
		System.out.println("pre-condition"+"\n");

	}

	@Test
	public void test() 
	{
		System.out.println("test executed");
	}
	
	@Test
	public void test1() 
	{
		System.out.println("test1 executed");
	}


}
