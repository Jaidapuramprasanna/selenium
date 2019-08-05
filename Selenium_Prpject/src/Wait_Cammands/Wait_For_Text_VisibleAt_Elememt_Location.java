package Wait_Cammands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_For_Text_VisibleAt_Elememt_Location {

	public static void main(String[] args) throws Exception 
	{
     
		 WebDriver driver=new ChromeDriver();
	     driver.get("https://www.Gmail.com");
	     driver.manage().window().maximize();
	     Thread.sleep(4000);
	     
	     // Enter email press enter key at keyboard
	     driver.findElement(By.id("identifierId")).clear();
	     driver.findElement(By.id("identifierId")).sendKeys("jaidapuramprasanna100@gmail.com",Keys.ENTER);
	     
	     // Identify location store to referral
	     By text_locater=By.xpath("//span[contains(.,'Welcome')]");
	     new WebDriverWait(driver, 30).until(ExpectedConditions.textToBePresentInElementLocated(text_locater, "Welcome"));
	     
	     System.out.println("welcome text visible at webpage");
	     
	     driver.findElement(By.name("password")).clear();
		 driver.findElement(By.name("password")).sendKeys("hello12345",Keys.ENTER);
		
	     

	  
	}

}
