package Browser_Lunch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Trip {

	public static void main(String[] args) throws InterruptedException
	{


		 WebDriver driver=new ChromeDriver();
	     driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     
	     WebElement submit_btn=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
	     submit_btn.click();
	     Thread.sleep(3000);
	     
	     try 
	     {
	    	 Alert alert=driver.switchTo().alert();
	    	 
	    	 String alert_text=alert.getText();
	    	 System.out.println("=>"+alert_text);
	    	 
	    	 alert.accept();
	    	 
			
		} catch (NoAlertPresentException e) 
	     {
			e.printStackTrace();
			System.out.println("alert not present");
		 }
	     
	     System.out.println("Run continue");

	   
	}

}
