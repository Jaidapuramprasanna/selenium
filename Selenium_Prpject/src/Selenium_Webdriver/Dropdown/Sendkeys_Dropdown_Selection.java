package Selenium_Webdriver.Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sendkeys_Dropdown_Selection {

	public static void main(String[] args) throws Exception 
	{

		 WebDriver driver=new ChromeDriver();
	     driver.get("https://www.facebook.com");
	     driver.manage().window().maximize();
	     Thread.sleep(10000);
	     
	     // Select dropdown option Using keyboard characters
	    new Select(driver.findElement(By.id("day"))).selectByIndex(1);
	    
	     // Select dropdown option Using keyboard characters
	    driver.findElement(By.id("month")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);


	}

}
