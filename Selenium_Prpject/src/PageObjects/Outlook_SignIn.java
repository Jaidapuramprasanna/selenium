package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Outlook_SignIn 
{
	public Outlook_SignIn(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
     
	@FindBy(xpath = "//a[@class='linkButtonSigninHeader']")
	WebElement signin_btn;
	
	  
	@FindBy(xpath = "//input[@class='form-control ltr_override']")
	WebElement Email_EB;
	
	@FindBy(xpath = "//input[@class='btn btn-block btn-primary']")
	WebElement Email_next_btn;
	
	
	
	
}
