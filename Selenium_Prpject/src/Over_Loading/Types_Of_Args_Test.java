package Over_Loading;

public class Types_Of_Args_Test {
	
	  void show(String c)
		{
	    	 System.out.println("executed 1");
		}
	     
	     void show(int a)
	 	{
	     	 System.out.println("executed 2");
	 	}

	public static void main(String[] args) 
	{

		Types_Of_Args_Test t=new Types_Of_Args_Test();
		t.show(90);
		t.show("pallavi");
		
	}

}
