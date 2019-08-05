package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Clear_trip {

	public static void main(String[] args) throws Exception 
	{


		 WebDriver driver=new ChromeDriver();
	     driver.get("https://www.Cleartrip.com");
	     driver.manage().window().maximize();
	     
	     JavascriptExecutor js=((JavascriptExecutor)driver);
	     
 
	    driver.findElement(By.id("RoundTrip")).click();
	    driver.findElement(By.id("ReturnDate")).click();
	    
	    ((JavascriptExecutor)driver).executeScript("window.scroll(100,200)");
	    Thread.sleep(2000);
	    
	    new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@data-event,'click')]"))).click();
	   

}
}