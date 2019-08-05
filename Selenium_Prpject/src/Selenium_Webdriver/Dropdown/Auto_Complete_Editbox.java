package Selenium_Webdriver.Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Auto_Complete_Editbox {

	public static void main(String[] args) throws Exception  
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Click Roundtrip radio button
		driver.findElement(By.xpath("//input[@id='RoundTrip']")).click();
		Thread.sleep(5000);

		
		//type input to the fromtag
		driver.findElement(By.xpath("//input[contains(@id,'FromTag')]")).clear();
		driver.findElement(By.xpath("//input[contains(@id,'FromTag')]")).sendKeys("KUV");
		Thread.sleep(5000);
		
        driver.findElement(By.partialLinkText("Gunsan, KR - Kunsan (KUV)")).click();
        
    	// type input to the Totag
		driver.findElement(By.xpath("//input[@id='ToTag']")).clear();
		driver.findElement(By.xpath("//input[@id='ToTag']")).sendKeys("BOM");
		Thread.sleep(5000);
		
        driver.findElement(By.linkText("Mumbai, IN - Chatrapati Shivaji Airport (BOM)")).click();
	
	

         //Select date from current month
        driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
	    driver.findElement(By.linkText("19")).click();
        
        driver.findElement(By.xpath("//input[@id='ReturnDate']")).click();
	    driver.findElement(By.linkText("22")).click();
	    
	    new Select(driver.findElement(By.xpath("//select[@id='Adults']")))
	    .selectByVisibleText("6");
	    
	    new Select(driver.findElement(By.xpath("//select[@id='Childrens']")))
	    .selectByVisibleText("1");
	    
	    new Select(driver.findElement(By.xpath("//select[@id='Infants']")))
	    .selectByVisibleText("3");
	    
	    // Click moreoption link
	    driver.findElement(By.partialLinkText(" Class of travel, Airline preference")).click();
	    
	    
	    //select class of travel
	    new Select(driver.findElement(By.xpath("//select[@id='Class']"))).selectByVisibleText("Premium Economy");
		Thread.sleep(5000);

	    
	    // enter something value in preffered airline
         driver.findElement(By.id("AirlineAutocomplete")).clear();
         driver.findElement(By.id("AirlineAutocomplete")).sendKeys("air asia");
 		 Thread.sleep(5000);
 		 
 		 driver.findElement(By.xpath("//a[@tabindex='-1'][contains(.,'Air Asia Indonesia (XT)')]")).click();
 		 
 		 // Click search button
 		 driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();




	}

}
