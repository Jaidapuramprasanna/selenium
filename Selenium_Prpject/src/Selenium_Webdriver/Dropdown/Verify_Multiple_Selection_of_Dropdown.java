package Selenium_Webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Multiple_Selection_of_Dropdown {

	public static void main(String[] args) throws Exception
	{

		WebDriver driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/idirectcontent/Home/Home.aspx");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		
		// Identify dropdown multiple selection
		Boolean flag=new Select(driver.findElement(By.id("open_account"))).isMultiple();
		System.out.println("multiple selection dropdown state is =>"+flag);
		
		
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('open_account').setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		boolean flag1=new Select(driver.findElement(By.id("open_account"))).isMultiple();
		System.out.println("Multiple Dropdown selection state is => "+flag1);

		//Select Multiple Options at combobox.
				Select Open_account=new Select(driver.findElement(By.id("open_account")));
				Open_account.deselectAll();
				Open_account.selectByVisibleText("Investment Account");
				Open_account.selectByVisibleText("Financial Learning Programmes");
				Open_account.selectByIndex(3);
				Open_account.selectByIndex(4);
				
				int count=Open_account.getAllSelectedOptions().size();
				
				if(count > 3)
				{
					System.out.println("Test fail selected more than 3 options");
				}
	}

}
