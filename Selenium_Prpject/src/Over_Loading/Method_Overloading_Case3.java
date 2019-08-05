package Over_Loading;

public class Method_Overloading_Case3
{

	  void show(StringBuffer a)
	 	{
	     	 System.out.println("stringbuffor method");
	 	}
	    void show(String a)
			{
		    	 System.out.println("string method");
			}
		
	public static void main(String[] args) 
	{
		Method_Overloading_Case3 t=new Method_Overloading_Case3();
		t.show(new StringBuffer("a"));
		t.show("a");
	}
		
}