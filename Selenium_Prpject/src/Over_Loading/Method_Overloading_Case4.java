package Over_Loading;

public class Method_Overloading_Case4 
{
	  void show(int a,float b)
		{
	   	 System.out.println("int float method");
		}
	    
	    void show(float a,int b )
		{
	    	 System.out.println("float int method");
		}
	   

	public static void main(String[] args) 
	{
		Method_Overloading_Case4 t=new Method_Overloading_Case4();
		t.show(30.9f, 40);
		t.show(20 , 56.5f);
		
	}

}
