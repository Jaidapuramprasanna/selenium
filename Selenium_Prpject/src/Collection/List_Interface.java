package Collection;

import java.util.ArrayList;
import java.util.List;

public class List_Interface {

	public static void main(String[] args) 
	{

		List<String> list=new ArrayList<String>();
		list.add("prakash");
		list.add("pallavi");
		list.add("priyanka");
		list.add("prasanna");
		list.add("praveen");
		list.add("pallavi");

		int count=list.size();
		System.out.println("size of list =>"+count);
		
		String itr_next=list.get(3);
		System.out.println("itr_next =>"+itr_next);
		
		// Iterate for each loop 
		for (String eachlist : list) 
		{
			System.out.println("&"+eachlist);
		}


			}

}
