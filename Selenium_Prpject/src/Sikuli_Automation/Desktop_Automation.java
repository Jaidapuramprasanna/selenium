package Sikuli_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

import com.tigervnc.rfb.screenTypes;

public class Desktop_Automation {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		String screen="C:\\Users\\Chandu\\Desktop\\Screens\\";
		
		Screen ob=new Screen();
		
		ob.type(screen+"email.PNG" ,"8765432");
		ob.type(screen+"password.PNG" ,"23345");
		ob.click(screen+"login.PNG");
	}
	}
