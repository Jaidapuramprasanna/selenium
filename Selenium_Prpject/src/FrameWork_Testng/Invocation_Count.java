package FrameWork_Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Invocation_Count
{
	public WebDriver driver;
	public String url="https://www.facebook.com";
	
  int i=1;
  @Test(invocationCount=12)
  public void f()
  {
	 WebElement Month_dropdown = driver.findElement(By.cssSelector("#month"));
	  new Select(Month_dropdown).selectByIndex(i);
	  
	  i=i+1;
  }
  @BeforeClass
  public void beforeClass()
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(url);
  }

  @AfterClass
  public void afterClass() 
  {
	  driver.close();
  }

}
