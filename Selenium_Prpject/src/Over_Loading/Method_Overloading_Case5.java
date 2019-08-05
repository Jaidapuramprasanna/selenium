package Over_Loading;

public class Method_Overloading_Case5 
{
	/*
	 * variable arguments:--> varargs allow Zero to multiple arguments
	 */
	  void show(int a)
		{
	    	 System.out.println("int method");
		}
	     
	     void show(int...a)
	 	{
	     	 System.out.println("varargs method");
	 	}
	     

	public static void main(String[] args) 
	{
		 Method_Overloading_Case5 t=new  Method_Overloading_Case5();
		 t.show();
		 t.show(20);
		 t.show(10 ,28 ,33);
	}

}
