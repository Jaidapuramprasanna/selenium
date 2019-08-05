package Wait_Cammands;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementHover_WaitForElement_Visible {

	public static void main(String[] args) throws InterruptedException 
	{


		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("https://www.hdfcbank.com");
	     driver.manage().window().maximize();
	     Thread.sleep(4000);
	     
	     Actions action=new Actions(driver);
	     
	     WebElement product=driver.findElement(By.linkText("Products"));
	     product.click();
	     
	     action.moveToElement(product).perform();
	     
	     new WebDriverWait(driver, 10).until
			(ExpectedConditions.visibilityOfElementLocated
					(By.linkText("Cards"))).click();
			
	}

}
