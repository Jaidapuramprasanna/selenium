package Framework_Testng_CrossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class crossbrowser_test 
{
	static WebDriver driver;
	
	
	@Test(priority=0)
	@Parameters("browsername")
	public void launchBrowser(String browser) 
	{
		switch (browser)
		{
		case "chrome":
		{
			driver=new ChromeDriver();
		    break;
		}
		case "firfox":
		{
			driver=new FirefoxDriver();
		    break;
		}
		case "ie":
		{
			driver=new InternetExplorerDriver();
		    break;
		}

        default:
        	System.out.println("browser mismatch");
			break;
		}
	   
  }
	@Test(priority=1)
	@Parameters("app url")
	public static void loadapp(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test(priority=2)
	public static void flight_search() throws Exception
	{
		// type referral into textbox
		driver.findElement(By.cssSelector("#FromTag")).clear();
		driver.findElement(By.cssSelector("#FromTag")).sendKeys("DEL");
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
	    Thread.sleep(2000);
	    
		driver.findElement(By.cssSelector("#ToTag")).clear();
		driver.findElement(By.cssSelector("#ToTag")).sendKeys("PNQ");
		driver.findElement(By.linkText("Pune, IN - Lohegaon (PNQ)")).click();
	    Thread.sleep(2000);

		
		driver.findElement(By.linkText("31")).click();
	    Thread.sleep(2000);



	}
}
