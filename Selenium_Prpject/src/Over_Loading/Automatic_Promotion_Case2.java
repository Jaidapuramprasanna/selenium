package Over_Loading;

public class Automatic_Promotion_Case2 
{
	     /*
	      * Object:--> Object is a parent class of all classes 
	      * in java
	      */
		     
		    void show(Object a)
		 	{
		     	 System.out.println("object method");
		 	}
		    void show(String a)
				{
			    	 System.out.println("string method");
				}
			  
		 
	public static void main(String[] args) 
	{
		Automatic_Promotion_Case2 t=new Automatic_Promotion_Case2();
		t.show('a');
		t.show("abc");
	}

}
