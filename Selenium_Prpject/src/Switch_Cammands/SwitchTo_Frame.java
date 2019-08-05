package Switch_Cammands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame {

	public static void main(String[] args) throws Exception
	{

		 WebDriver driver=new ChromeDriver();
	     driver.get("https://www.cleartrip.com/account/trips?src=managetrips");
	     driver.manage().window().maximize();
	     Thread.sleep(4000);
	     
	     // Switch to frame using frame id/name
	     driver.switchTo().frame("modal_window");
	     
	     // locate element under frame
	     WebElement email=driver.findElement(By.cssSelector("#email"));
	     email.click();
	     email.sendKeys("vihaan123");
	}

}
