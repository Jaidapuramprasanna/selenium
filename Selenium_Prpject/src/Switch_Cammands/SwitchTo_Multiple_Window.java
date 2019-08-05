package Switch_Cammands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Multiple_Window {

	public static void main(String[] args) throws Exception 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		
		
		// Switch to mainwindow
		Set<String> mainwindow=driver.getWindowHandles();
		System.out.println("mainwindow id =>"+driver.getWindowHandle());
		
		// Click external link to open new window
		driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/trains/pnr']")).click();
		Thread.sleep(2000);
		
		// Click external link to open new window
		driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/trains/calendar']")).click();
		Thread.sleep(2000);
		
		// Click external link to open new window
		driver.findElement(By.xpath("//a[contains(@href,'cancellation.shtml#cancel')]")).click();
		Thread.sleep(2000);
		
		// Click external link to open new window
		driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/offers/india/irctc-packages']")).click();
		Thread.sleep(2000);
		
		// get all window's Id open throw webdriver
		Set<String> AllwindowID=driver.getWindowHandles();
		//Apply forloop
		for (String Eachwindow : AllwindowID) 
		{
			// Apply Switch to all window iteration wise
			driver.switchTo().window(Eachwindow);
			// Capture runtime title of each window
			String runtime_title=driver.getTitle();
			
			// where runtime title matches with expected title accept condition
			if (runtime_title.contains( "seat availability"))
			{
				break;
			}
			System.out.println("current window focused on =>"+driver.getTitle());
		}
				
				
				
		
		
		
		
		
		
	}

}
