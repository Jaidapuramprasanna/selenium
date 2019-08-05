package Wait_Cammands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Complete_Editbox_ImplicitWait {

	public static void main(String[] args) throws Exception
	{


		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("https://www.Cleartrip.com");
	     driver.manage().window().maximize();
	     Thread.sleep(4000);
	     
	     driver.findElement(By.id("FromTag")).clear();
	     driver.findElement(By.id("FromTag")).sendKeys("HYD");
	     driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();	
	     
	     driver.findElement(By.id("ToTag")).clear();
	     driver.findElement(By.id("ToTag")).sendKeys("DEL");
	     driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();	
	     
	     //Identify the departure date from editbox
	     driver.findElement(By.id("DepartDate")).clear();
	     driver.findElement(By.id("DepartDate")).sendKeys("Sat, 3 july, 2019");
	   
	     // Select searchbtn
	      driver.findElement(By.id("SearchBtn")).click();
	     
	     




	   
	     
	}

}
