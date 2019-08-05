package Sikuli_Automation;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class direct_automation {

	public static void main(String[] args) throws FindFailed
	{
		
		Screen ob=new Screen();
		
		ob.doubleClick("C:\\Users\\Chandu\\Desktop\\Screens\\sample.PNG\\");
		ob.click("C:\\Users\\Chandu\\Desktop\\Screens\\maximize.PNG");
		ob.click("C:\\Users\\Chandu\\Desktop\\Screens\\cancel.PNG");
	}

}
