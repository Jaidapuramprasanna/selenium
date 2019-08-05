package Capture_Screen;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenWith_TimeStamp {

	public static void main(String[] args) throws IOException 
	{


		 WebDriver driver=new ChromeDriver();
	     driver.get("https://www.firstnaukri.com/jobs-internship");
	     driver.manage().window().maximize();
	    
	     // Object for date
	     Date d=new Date(34);
	     
	     SimpleDateFormat sdf=new SimpleDateFormat("yyyy/mmm/dd hh-mm-ss");
	     
	     String time=sdf.format(d);
	     
	     File val=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(val, new File("Screen\\image.png"));
	}

}
