package Switch_Cammands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlertHandling_With_ExpectedConditions {

	public static void main(String[] args) throws Exception
	{

		 WebDriver driver=new ChromeDriver();
	     driver.get("https://www.firstnaukri.com/jobs-internship");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     
	     // click Search 
         WebElement search_btn=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
         search_btn.click();
         
         // Write condition statement to alert presented at webpage
         if (ExpectedConditions.alertIsPresent().apply(driver)!=null) 
         {
        	 // Block of code execute only for alert presented
        	 Alert alert=driver.switchTo().alert();
        	 
        	 String alert_text=alert.getText();
        	 System.out.println("alert msg =>"+alert_text);
        	 
        	 //using alert referral close alert window
        	 alert.accept();
        	 
			
		} else
		{
           System.out.println("alert not presented");
		}
	  
	     
	}

}
