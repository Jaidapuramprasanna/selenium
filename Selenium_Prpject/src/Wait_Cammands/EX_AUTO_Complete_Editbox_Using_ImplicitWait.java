package Wait_Cammands;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_AUTO_Complete_Editbox_Using_ImplicitWait {

	public static void main(String[] args) throws InterruptedException
	{


		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://www.Makemytrip.com");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	   
	     driver.findElement(By.xpath("//input[@id='fromCity']")).click();
	     driver.findElement(By.xpath("(//p[contains(.,'London, United Kingdom')])[2]")).click();
	     Thread.sleep(2000);
	    

	     driver.findElement(By.xpath("//input[contains(@placeholder,'To')]")).click();
	     driver.findElement(By.xpath("(//div[contains(@class,'calc60')])[1]")).click();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("departure")).click();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("//div[@role='gridcell']/div[@class='dateInnerCell'][1]")).click();

	   
	 
	   


	     
	          
	    
	     
	    	}

		
	

}
