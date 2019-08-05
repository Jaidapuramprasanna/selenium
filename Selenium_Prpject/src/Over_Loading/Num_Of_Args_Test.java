package Over_Loading;

public class Num_Of_Args_Test 
{
     void show()
	{
    	 System.out.println("1");
	}
     
     void show(int a)
 	{
     	 System.out.println("2");
 	}
     
     void show(int a,int b)
  	{
      	 System.out.println("3");
  	}
     
     public static void main(String[] args) 
     {
    	 Num_Of_Args_Test t=new  Num_Of_Args_Test();
    	 t.show(20);
    	 t.show();
    	 t.show(30, 20);
	}

}
