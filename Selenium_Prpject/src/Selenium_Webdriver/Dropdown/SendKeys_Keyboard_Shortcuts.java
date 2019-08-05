package Selenium_Webdriver.Dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Keyboard_Shortcuts {

	public static void main(String[] args) throws InterruptedException 
	{


		 WebDriver driver=new ChromeDriver();
	     driver.get("https://www.Gmail.com");
	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	     
	     // Identify email locater type text
	     driver.findElement(By.xpath("//input[@id='identifierId']")).clear();
	     driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("jaidapuramprasanna100@gmail.com",Keys.ENTER);
	     
	     Thread.sleep(5000);
	     // Identify email locater type text
	     driver.findElement(By.xpath("//input[@type='password']")).clear();
	     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("456022133",Keys.ENTER);


	}

}
