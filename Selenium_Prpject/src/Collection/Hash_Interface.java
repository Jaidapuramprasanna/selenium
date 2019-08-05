package Collection;

import java.util.Hashtable;
import java.util.Set;


public class Hash_Interface {

	public static void main(String[] args) 
	{
		/*
		 * Hash_Interface:--> Hash accept objects to store using key and value,
		 *                    hash set allows pair values to store.
		 */
		
		Hashtable<Integer,String> hash=new Hashtable<Integer,String>();
		hash.put(1,"prasanna");
		hash.put(2,"raju");
		hash.put(3,"priyanka");
		hash.put(4,"vihaan");

		
		// Number of objects
		int count=hash.size();
		System.out.println("size of set=>"+count);
		
		// Using key name n key value
		String val=hash.get(2);
		System.out.println("=>"+val);
		
		// get all keys
		Set<Integer> set=hash.keySet();
		
		// For each array to iterate
		for (Integer eachset : set) 
		{
			System.out.println("=>"+eachset);
		}

	}

}
