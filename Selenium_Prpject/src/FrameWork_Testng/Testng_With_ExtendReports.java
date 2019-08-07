package FrameWork_Testng;

import org.testng.annotations.Test;

import com.android.dx.cf.iface.Method;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Testng_With_ExtendReports 
{
	ExtentReports extent;
	ExtentTest reporter;
	WebDriver driver;
	String filepath="E:\\vihaan\\extend.html";
	String Exp_title="Selenium - Web Browser Automation";
	

  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	 // reporter=extent.startTest(Method.ge);
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() 
  {
	  driver=new ChromeDriver();
	  driver.get("https://www.seleniumhq.org/");
	  driver.manage().window().maximize();
	  
	  //create extent reports
	  extent=new ExtentReports(filepath,true);
  }

  @AfterClass
  public void afterClass() throws Exception 
  {
	  Thread.sleep(2000);
	  driver.close();
	  extent.flush();
  }

}
