package Browser_Lunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Make_My_Trip {

	public static void main(String[] args) 
	{


		 WebDriver driver=new ChromeDriver();
	     driver.get("https://www.Makemytrip.com");
	     driver.manage().window().maximize();
	   
	}

}
