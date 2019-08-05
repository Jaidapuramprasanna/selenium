package Switch_Cammands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Alert {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/jobs-internship");
		driver.manage().window().maximize();
		
		// Click search button
		WebElement Search_btn=driver.findElement(By.xpath("//input[@value='Search']"));
		Search_btn.click();
		
		Alert alert=driver.switchTo().alert();
		System.out.println("alert presented");
		
		String alert_text=alert.getText();
		System.out.println("alert msg =>"+alert_text);
		
		alert.accept();
	
	}

}
