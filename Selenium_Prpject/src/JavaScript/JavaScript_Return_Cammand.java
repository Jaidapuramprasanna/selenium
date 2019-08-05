package JavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Return_Cammand {

	public static void main(String[] args) throws Exception
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		// return title
		String page_title=js.executeScript("return document.title").toString();
		System.out.println("page_title"+page_title);
		
		
	}

}
