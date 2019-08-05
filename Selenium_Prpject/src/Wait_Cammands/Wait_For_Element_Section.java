package Wait_Cammands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_For_Element_Section {

	public static void main(String[] args) throws InterruptedException 
	{
    

		 WebDriver driver=new ChromeDriver();
	     driver.get("https://www.cleartrip.com");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     
	     // Identify element
	     WebElement RoundTrip_btn=driver.findElement(By.xpath("//input[@id='RoundTrip']"));
	     RoundTrip_btn.click();
	     
	     WebDriverWait wait=new WebDriverWait(driver, 10);
	     wait.until(ExpectedConditions.elementSelectionStateToBe(RoundTrip_btn, true));
	     System.out.println("roundtrip btn selected");
	     
	     
	     
	     
	     
	     
	   
	}

}
