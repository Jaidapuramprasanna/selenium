package JavaScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Given {

	public static void main(String[] args) throws Exception 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;

		
		WebElement login_btn=driver.findElement(By.xpath("//input[contains(@data-testid,'royal_login_button')]"));
		login_btn.click();
		Thread.sleep(2000);

		
		WebElement login=driver.findElement(By.xpath("//button[@id='loginbutton']"));
		login.click();
		Thread.sleep(2000);

		
		
		
		
		
		
		
		
		
	}

	
}
