package Selenium_Webdriver.Dropdown;

import org.apache.poi.ss.formula.functions.BooleanFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Multiple_Selection {

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

		Select Multiple_selection=new Select(driver.findElement(By.id("open_account")));
		Multiple_selection.deselectAll();  //Clear all existing selections
		Multiple_selection.selectByIndex(1);		
		Multiple_selection.selectByIndex(3);
		Multiple_selection.selectByIndex(5);
		
		int Count=Multiple_selection.getAllSelectedOptions().size();
		System.out.println("Selection Count is => "+Count);
		
		Multiple_selection.deselectByIndex(3);
		
		int deselect_count=Multiple_selection.getAllSelectedOptions().size();
		System.out.println("Selection Count is After deselection=> "+deselect_count);
		
		

		
		

		
		
	}

}
