package Switch_Cammands;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unexperted_AlertTo_Handle {
	
    public static WebDriver driver;
	public static void main(String[] args) 
	{

		try 
		{  
		    driver=new ChromeDriver();
			driver.get("https://www.firstnaukri.com/jobs-internship");
			driver.manage().window().maximize();
			
			// Click search button
			WebElement Search_btn=driver.findElement(By.xpath("//input[@value='Search']"));
			Search_btn.click();
			Search_btn.click();

			
			
			
			
		} catch (UnhandledAlertException e) {
		
		  System.out.println("there is one unhandled alert present at webpage");
		
		  // Block of code executed only on alert presented 
			Alert alert=driver.switchTo().alert();
			System.out.println("alert presented");
			
			String alert_text=alert.getText();
			System.out.println("alert msg=>"+alert_text);
			
			//Using alert referral close alert window
			alert.accept();

			
		
	}

}
}