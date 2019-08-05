package Wait_Cammands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_For_Numberof_Windows_Count {

	public static void main(String[] args) throws Exception
	{

		 WebDriver driver=new ChromeDriver();
	     driver.get("https://www.facebook.com");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     
	     driver.findElement(By.linkText("Instagram")).click();
	     
	     WebDriverWait wait=new WebDriverWait(driver, 15);
	     wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	     System.out.println("timeout released expected windows are opened");
	     
	  
	}

}
