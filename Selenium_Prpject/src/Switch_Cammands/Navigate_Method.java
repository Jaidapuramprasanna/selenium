package Switch_Cammands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Method {

	public static void main(String[] args) throws Exception 
	{


		 WebDriver driver=new ChromeDriver();
	     driver.navigate().to("https://www.facebook.com");
	     Thread.sleep(4000);
	     
	     driver.navigate().to("https://www.seleniumhq.org");
	     Thread.sleep(4000);
	     
	     driver.navigate().back();
	     Thread.sleep(4000);
	     
	     driver.navigate().forward();
	     Thread.sleep(4000);

	    
	  
	}

}
