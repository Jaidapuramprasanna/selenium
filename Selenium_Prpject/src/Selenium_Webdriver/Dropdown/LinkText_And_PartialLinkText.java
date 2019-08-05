package Selenium_Webdriver.Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_And_PartialLinkText {

	public static void main(String[] args) throws Exception 
	{


		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Click link using original linkname
		 driver.findElement(By.linkText("About Us")).click();
		 
		//Click link using original linkname
		 driver.findElement(By.linkText("Jobs")).click();
		
		 //Click link using original linkname
		 driver.findElement(By.linkText("Job Openings")).click();
		 

		 //Click link using partial linkname
		 driver.findElement(By.partialLinkText("Product Content Writer")).click();
		
		 
		 
		 
				
		
		
		
	}

}
