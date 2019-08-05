package Framework_Junit;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Junit_Testcase 
{
	static WebDriver driver;
	String url="https://www.facebook.com";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	
	@Test
	public void test() throws Exception 
	{
		// Load page
		driver.get(url);
		
		// Identify email location n enter text
		driver.findElement(By.cssSelector("input#email")).clear();
		driver.findElement(By.cssSelector("input#email")).sendKeys("prasanna1234",Keys.ENTER);
		
		Thread.sleep(2000);
		
		// Identify email location n enter text
		driver.findElement(By.cssSelector("input#pass")).clear();
		driver.findElement(By.cssSelector("input#pass")).sendKeys("1234566",Keys.ENTER);
				
	    Thread.sleep(2000);

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(2000);
	}

}
