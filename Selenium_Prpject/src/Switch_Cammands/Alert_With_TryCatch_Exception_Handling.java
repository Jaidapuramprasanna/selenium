package Switch_Cammands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_With_TryCatch_Exception_Handling {

	public static void main(String[] args) throws Exception
	{

		 WebDriver driver=new ChromeDriver();
	     driver.get("https://www.firstnaukri.com/jobs-internship");
	     driver.manage().window().maximize();
	     
	     WebElement search_btn=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
	     search_btn.click();
	     Thread.sleep(2000);
	     
	     try {
	    	 
	    	 Alert alert=driver.switchTo().alert();
	    	 System.out.println("alert presented");
	    	 
	    	 String alert_text=alert.getText();
	    	 System.out.println("alert msg=>"+alert_text);
	    	 
			
		} catch (NoAlertPresentException e) 
	     {

			 e.printStackTrace();
			 System.out.println("alert not present");
	     }
	     System.out.println("Run continue");
	     driver.switchTo().alert().accept();
	}

}
