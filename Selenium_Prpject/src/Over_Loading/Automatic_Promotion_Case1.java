package Over_Loading;

public class Automatic_Promotion_Case1 
{
	  void show(String a)
		{
	    	 System.out.println("string method");
		}
	     
	     void show(int a)
	 	{
	     	 System.out.println("int method");
	 	}
	     
	    

	public static void main(String[] args) 
	{
 
		Automatic_Promotion_Case1 t=new Automatic_Promotion_Case1();
		t.show('a');
	}

}
