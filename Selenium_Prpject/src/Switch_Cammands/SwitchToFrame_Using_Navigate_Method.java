package Switch_Cammands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame_Using_Navigate_Method {

	public static void main(String[] args) throws Exception 
	{


		 WebDriver driver=new ChromeDriver();
	     driver.get("https://www.cleartrip.com/account/trips?src=managetrips");
	     driver.manage().window().maximize();
	     Thread.sleep(4000);
	  
	     // Navigating a frame using page info
	     driver.navigate().to("https://www.cleartrip.com/signinstatic/tripidlogin.shtml?popop=np&guest=true");
	     
	     // locate element under frame
	     WebElement email=driver.findElement(By.xpath("//input[contains(@id,'email')]"));
	     email.clear();
	     email.sendKeys("prasanna123");
	     
	     // navigate back to the mainpage from frame
	     driver.navigate().back();
	     Thread.sleep(4000);
	     
	     driver.navigate().forward();
	     Thread.sleep(4000);
	     
	}

}
