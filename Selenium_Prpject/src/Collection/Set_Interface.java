package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Interface {
	/*
	 * Collection:--> Root interface with basic method is add(),
	 *                remover(),contains(),isEmpty(),addAll()....etc
	 */
	
	/*
	 * Set:--> It doesnt allow dublicates elements are not-order
	 *        1.Hash set
	 *        2.Tree set
	 */


	public static void main(String[] args) 
	{

	   Set<String> set=new HashSet<String>();
	   set.add("IDE");
	   set.add("APPIUM");
	   set.add("WEBDRIVER");
	   set.add("GRID");
	   set.add("IDE");
	   
	   int count=set.size();
	   System.out.println("size of sets=>"+count);
	   
	   // Apply for each loop to print all object
	   for (String eachset : set)
	   {
		   System.out.println("=>"+eachset);
		
	   }
	   
	   // Remove object
	   set.remove("WEBDRIVER");
	   
	   // Verify object contains at set interface
	   boolean flag=set.contains("IDE");
	   System.out.println("object available in status =>"+flag);
	   
	   // Get next iterator of set
	   String itr_next=set.iterator().next();
	   System.out.println("third iterator value is "+itr_next);
	   
	   // Using while loop to print all object
	   Iterator<String> itr=set.iterator();
	   while (itr.hasNext())
	   {
		String play = (String) itr.next();
		System.out.println("#"+play);
		
	   }
	}
	   


	}


