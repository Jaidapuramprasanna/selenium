package FrameWork_Testng;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Testng_method_Dependencies 
{
	
  @BeforeClass
  public void setup_browser() 
  {
     System.out.println("setup all disired capabilities");
  }

  @Test(priority=0)
  public void browser_lunch() 
  {
	  Reporter.log("browser lunch sucessfully");
  }
  
  @Test(priority=1,dependsOnMethods={"browser_lunch"})
  public void App_load() 
  {
	  Assert.assertEquals("SignIn", "SignIn");
	  Reporter.log("app load sucessfully");
  }
  
  @Test(priority=2,dependsOnMethods={"App_load"})
  public void User_login() 
  {
	  Assert.assertEquals("email", "email");
	  Reporter.log("user login sucessfully");
  }
  @Test(priority=3,dependsOnMethods={"User_login"})
  public void composeEmail() 
  {
	  Assert.assertEquals("msg", "msg");
	  Reporter.log("Email sent sucessfully");
  }
  
  @Test(priority=4,dependsOnMethods={"User_login"})
  public void search_email() 
  {
	  Assert.assertEquals("mail", "mail");
	  Reporter.log("mail found");
  }
  
  @Test(priority=5,dependsOnMethods={"User_login"})
  public void verify_Email_At_inbox() 
  {
	  Assert.assertEquals("user", "user");
	  Reporter.log("mail found at inbox");
  }
  
  @Test(priority=6,dependsOnMethods={"composeEmail","User_login"})
  public void verify_Email_At_sentemails() 
  {
	  Assert.assertTrue(true);
	  Reporter.log("sent mail found");
  }
  
  @Test(priority=7,dependsOnMethods={"User_login"})
  public void user_Signout() 
  {
	  Assert.assertEquals("Login","Login");
	  Reporter.log("Signout sucessfully");
  }
  
   @AfterClass
  public void close_browser() 
  {
	  System.out.println("browser closed");
  }

}
