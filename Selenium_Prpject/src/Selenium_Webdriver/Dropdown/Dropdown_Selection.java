package Selenium_Webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		new Select(driver.findElement(By.xpath("//select[@id='customState']")))
		.selectByVisibleText("Telangana");
		
		new Select(driver.findElement(By.xpath("//select[@id='customCity']")))
		.selectByVisibleText("Hyderabad");
		
		// Type locality
		driver.findElement(By.xpath("//input[@id='customLocality']")).clear();
		driver.findElement(By.xpath("//input[@id='customLocality']")).sendKeys("Amberpet");
		
		new Select(driver.findElement(By.xpath("//select[@id='customRadius']")))
		.selectByIndex(5);
		
		// Select check box
		driver.findElement(By.xpath("//input[contains(@id,'types50')]")).click();
		
		// Select Check box
		driver.findElement(By.xpath("//input[contains(@id,'types96')]")).click();
		
		// Click search button
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		
		

	}

}
