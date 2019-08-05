package Wait_Cammands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait_Until_InputValues_LoadAt_Editbox {

	public static void main(String[] args)  
	{

		 WebDriver driver=new ChromeDriver();
	     driver.get("https://www.Gmail.com");
	     driver.manage().window().maximize();
	     
	     // Locate element store in referral
	     By Email_locater=By.id("identifierId");
	     
	     driver.findElement(By.xpath("//input[@id='identifierId']")).clear();
	     driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("prasanna");
	     
	   
	}

}
