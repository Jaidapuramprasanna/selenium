package JavaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Popup_Window {

	public static void main(String[] args) throws Exception 
	{



		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.Makemytrip.com");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     
	     ((JavascriptExecutor)driver).executeScript("return alert('TC001 executed suscessfully')");
	     Thread.sleep(2000);
	     
	     // close alert 
	     driver.switchTo().alert().accept();
	     
	     ((JavascriptExecutor)driver).executeScript("return alert('second executed suscessfully')");
	     Thread.sleep(2000);
	     
	     // close alert 
	     driver.switchTo().alert().accept();
	   
	   
	}

}
