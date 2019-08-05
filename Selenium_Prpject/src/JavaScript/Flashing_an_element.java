package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flashing_an_element {

	public static void main(String[] args) 
	{


		 WebDriver driver=new ChromeDriver();
	     driver.get("https://www.Cleartrip.com");
	     driver.manage().window().maximize();
	     
	     // Create for interface for jsExecuter
	     JavascriptExecutor js=((JavascriptExecutor)driver);

	    // Identify element
	     WebElement Search_flights=driver.findElement(By.xpath("//h1[contains(.,'Search flights')]"));
	     
		 js.executeScript("arguments[0].style.backgroundColor='yellow'",Search_flights);

		 js.executeScript("arguments[0].style.outline='blue solid 2px'",Search_flights);
	   
	}

}
