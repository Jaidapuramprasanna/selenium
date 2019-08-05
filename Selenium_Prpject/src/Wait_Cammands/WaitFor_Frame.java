package Wait_Cammands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor_Frame {

	public static void main(String[] args) throws Exception 
	{


		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
         driver.get("https://www.redbus.in/hotels/");
         driver.manage().window().maximize();
         
         // Click sign_in button
         WebElement Sign_in=driver.findElement(By.xpath("//button[contains(.,'Sign in')]"));
         Sign_in.click();
         
         // Identify frame locater
         By modelFrame=By.className("modelFrame");
         
         WebDriverWait wait=new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(modelFrame));
         System.out.println("controls available at model frame");
         
         
	   
	}

}
