package Framework_Junit;

import static org.junit.Assert.*;

import java.io.File;
import java.sql.Date;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.graph.ElementOrder.Type;

import junit.framework.Assert;

public class JunitTest_Webdriver_Facebook_Link 
{
	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	
	@Before
	public void setUp() throws Exception
	{
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
	}

	@Test
	public void Verify_signup_link() 
	{
		driver.findElement(By.cssSelector("a[title*='Sign up for Facebook']")).click();
		String Exp_title="Facebook – log in or sign up";
		Assert.assertEquals(Exp_title, driver.getTitle());
        System.out.println("Title verified sign page verified ");
		
	}
	@Test
	public void Verify_login_link () 
	{
		driver.findElement(By.cssSelector("a[title*='Log in to Facebook']")).click();
		String Exp_title="Facebook – log in or sign up";
		Assert.assertEquals(Exp_title, driver.getTitle());
		System.out.println("Title verified login page verified ");
		
	}
	
	
	@After
	public void tearDown() throws Exception 
	{
		Date d=new Date(1);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/mmm/dd hh/ss/mm");
		
		String time=sdf.format(d);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\"+time+"picture.png"));

		
		
		
		
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		driver.close();
		
		
		
		
	}
	



}
