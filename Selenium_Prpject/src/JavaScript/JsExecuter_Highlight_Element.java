package JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecuter_Highlight_Element {

	public static void main(String[] args) throws Exception 
	{


		 WebDriver driver=new ChromeDriver();
	     driver.get("https://www.instagram.com/");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     
	     JavascriptExecutor js=((JavascriptExecutor)driver);
	     
	     // Identify element
	     WebElement insta_text=driver.findElement(By.xpath("//h2[@class='vvzhL '][contains(.,'Sign up to see photos and videos from your friends.')]"));
	     
		 js.executeScript("arguments[0].style.backgroundColor='yellow'",insta_text);

		 js.executeScript("arguments[0].style.outline='green solid 2px'",insta_text);
	   
	}

}
