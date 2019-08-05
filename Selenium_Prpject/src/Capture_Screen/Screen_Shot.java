package Capture_Screen;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Shot {

	public static void main(String[] args) throws IOException 
	{


		 WebDriver driver=new ChromeDriver();
	     driver.get("https://www.makemytrip.com/flights/");
	     driver.manage().window().maximize();
	    
	     File val=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(val, new File("Screen\\image.png"));
	}

}
