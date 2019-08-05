package Over_Loading;

public class Seqs_Of_Args_Test {
	

    void show(int a,String b)
	{
   	 System.out.println("executed 1");
	}
    
    void show(String a,int b )
	{
    	 System.out.println("executed 2");
	}
    
    void show(String a)
 	{
     	 System.out.println("executed 3");
 	}
    
	public static void main(String[] args) 
	{
		Seqs_Of_Args_Test t=new Seqs_Of_Args_Test();
		t.show(20,"sbn");
		t.show("prasanna", 30);
		t.show("vihaan");

	}

}
