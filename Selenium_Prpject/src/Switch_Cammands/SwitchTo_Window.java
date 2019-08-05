package Switch_Cammands;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window {

	public static void main(String[] args) throws Exception 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		String MainwindowID=driver.getWindowHandle();
		
		WebElement Instagram=driver.findElement(By.xpath("//a[contains(.,'Instagram')]"));
		Instagram.click();
		Thread.sleep(3000);
		
		// Get all windows'ID
		Set<String> AllwindowsID=driver.getWindowHandles();
		
		// Apply for each loop to iterate number of windows times
		for ( String EachwindowsID : AllwindowsID) 
		{
			if (!MainwindowID.equals(EachwindowsID))
			{
				driver.switchTo().window(EachwindowsID);
				break;
			}
		}
		String current_window_title=driver.getTitle();
		System.out.println(current_window_title);

		
		WebElement Mobile=driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
		Mobile.clear();
		Mobile.sendKeys("prasanna12345");
		Thread.sleep(3000);
		
		driver.switchTo().window(MainwindowID);
        System.out.println("current window title is=>"+driver.getTitle());
		
		
	}

}
