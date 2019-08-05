package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Runtime_Changes {

	public static void main(String[] args) throws Exception
	{


		 WebDriver driver=new ChromeDriver();
	     driver.get("https://www.facebook.com");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     
	   // create interface for jsexecuter
	     JavascriptExecutor js=((JavascriptExecutor)driver);
	     
	   // Identify element
	     WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
	     
	   // Disabled element
	     js.executeScript("arguments[0].disabled='true'", Email);
	     Thread.sleep(2000);

	  // Enabled element   
	     js.executeScript("arguments[0].disabled='false'", Email);
	     Thread.sleep(2000);
	     
	     js.executeScript("arguments[0].style.visibility='hidden'", Email);
	     Thread.sleep(2000);

	     
	     js.executeScript("arguments[0].style.visibility='visible'", Email);
	     Thread.sleep(2000);





	     
	   
	}

}
