package JavaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_Executer_Cammand {

	public static void main(String[] args) throws Exception
	{


		 WebDriver driver=new ChromeDriver();
	     driver.get("https://www.facebook.com");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     
	     // create interface for a javascript
	     JavascriptExecutor js=((JavascriptExecutor)driver);
	   
	     //type text into editbox using javascript
	     js.executeScript("document.getElementById('u_0_l').value='prasanna'");
		 js.executeScript("document.getElementById('u_0_n').value='Sam'");
		 
		 WebElement day_dropdown=driver.findElement(By.xpath("//select[contains(@id,'day')]"));
		 js.executeScript("arguments[0].value=4", day_dropdown);
		 
		 WebElement month_dropdown=driver.findElement(By.id("month"));
		 js.executeScript("arguments[0].value=5", month_dropdown);
		 
		 WebElement year_dropdown=driver.findElement(By.xpath("//select[contains(@id,'year')]"));
		 js.executeScript("arguments[0].value=1996", year_dropdown);
		
		 WebElement female_btn=driver.findElement(By.id("u_0_5"));
		 js.executeScript("arguments[0].click()", female_btn);
		 Thread.sleep(2000);
		 
		 WebElement male_btn=driver.findElement(By.id("u_0_6"));
		 js.executeScript("arguments[0].cheacked=true", male_btn);
		 Thread.sleep(2000);
		
		 
		 
		 
				}

}
