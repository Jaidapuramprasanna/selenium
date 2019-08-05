package FrameWork_Testng;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Webdriver_TestngClass 
{ 
	WebDriver driver;

  @Test
  public void verify_Signup_link() 
  {
	  driver.findElement(By.linkText("Sign Up")).click();
	  Assert.assertEquals("Facebook – log in or sign up", driver.getTitle());
	  Reporter.log("Signup link verified expected title displayed");
	  
  }
  
  @Test
  public void verify_Login_link() 
  {
	  driver.findElement(By.linkText("Log In")).click();
	  Assert.assertEquals("Facebook – log in or sign up", driver.getTitle());
	  Reporter.log("login link verified expected title displayed");
	  
  }
  
  @Test
  public void verify_Messenger_link() 
  {
	  driver.findElement(By.linkText("Messenger")).click();
	  Assert.assertEquals("https://messenger.com/", driver.getTitle());
	  Reporter.log("messenger link verified expected title displayed");
	  
  }




  @BeforeMethod
  public void beforeMethod()
  {
	  driver.get("https://www.facebook.com");
  }

  @AfterMethod
  public void afterMethod() throws IOException 
  {
	//Create simple date format
		SimpleDateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//Get system current date
		Date d=new Date();   //import java.util
		//using simple date formatter convert system current date
		String time=df.format(d);
		
		//Take screen at runtime and convert into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\"+time+"image.png"));
	  
  }

  @BeforeClass
  public void beforeClass() 
  {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() 
  {
	  driver.close();
  }

}
