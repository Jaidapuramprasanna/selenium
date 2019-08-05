package Browser_Lunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra_trip {

	public static void main(String[] args)
	{

		 WebDriver driver=new ChromeDriver();
	     driver.get("https://www.yatra.com/");
	     driver.manage().window().maximize();
	   
	}

}
