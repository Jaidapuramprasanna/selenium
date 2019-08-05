package Sikuli_Automation;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class automation {

	public static void main(String[] args) throws FindFailed 
	{
		
		String screen="C:\\Users\\Chandu\\Desktop\\Screens\\";
		
	    Screen ob=new Screen();
	    
	    ob.doubleClick(screen+"chrome.PNG");
	    ob.doubleClick(screen+"gmail.PNG");
	    

	}

}
