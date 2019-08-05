package Framework_Junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClass_and_AfterClass {

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

	@Test
	public void test1() 
	{
       System.out.println("test1 executed");
	}
	
	@Test
	public void test2() 
	{
       System.out.println("test2 executed");
	}
	
	@Test
	public void test3() 
	{
       System.out.println("test3 executed");
	}
	
	@Test
	public void test4() 
	{
       System.out.println("test4 executed");
	}




}
