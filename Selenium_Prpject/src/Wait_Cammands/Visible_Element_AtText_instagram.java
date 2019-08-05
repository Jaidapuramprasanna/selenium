package Wait_Cammands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Visible_Element_AtText_instagram {

	public static void main(String[] args) throws Exception 
	{

		 WebDriver driver=new ChromeDriver();
	     driver.get("https://www.instagram.com/accounts/login/?source=auth_switcher");
	     driver.manage().window().maximize();
	     
	     driver.findElement(By.name("username")).clear();
	     driver.findElement(By.name("username")).sendKeys("prasanna1667");
	     
	     driver.findElement(By.name("password")).clear();
	     driver.findElement(By.name("password")).sendKeys("7674925854");
	     

	     
	     
	   
	   
	
		
	}

}
