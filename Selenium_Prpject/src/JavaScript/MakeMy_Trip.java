package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMy_Trip {

	public static void main(String[] args) throws InterruptedException 
	{

		 WebDriver driver=new ChromeDriver();
	     driver.get("https://www.Makemytrip.com/");
	     driver.manage().window().maximize();
	     Thread.sleep(5000);
	     
	     driver.findElement(By.xpath("//label[@for='return']")).click();
	     
	     
	     
	  
	}

}
