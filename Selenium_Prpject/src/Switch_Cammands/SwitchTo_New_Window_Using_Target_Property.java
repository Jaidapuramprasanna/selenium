package Switch_Cammands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_New_Window_Using_Target_Property {

	public static void main(String[] args) throws Exception 
	{

		 WebDriver driver=new ChromeDriver();
	     driver.get("https://telanganaepass.cgg.gov.in");
	     driver.manage().window().maximize();
	     Thread.sleep(4000);
	  
	     WebElement External_link=driver.findElement(By.xpath("//a[@href='SCDD-RTIManual.pdf'][contains(.,'RTI Manual')]"));
	     External_link.click();
	     
	     driver.switchTo().window("new");
		 System.out.println("Current window url is => "+driver.getCurrentUrl());

	     
	}

}
