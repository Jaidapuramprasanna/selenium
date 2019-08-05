package Browser_Lunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriver_To_Lunch {

	public static void main(String[] args) 
	{
		 WebDriver driver=new ChromeDriver();
	     driver.get("https://www.makemytrip.com/flights/");
	     driver.manage().window().maximize();
	     }

}
