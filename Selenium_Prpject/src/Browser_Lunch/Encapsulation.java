package Browser_Lunch;

public class Encapsulation 
{
	private String name;
	public void get()
	{
		name = "value";
		System.out.println("prasanna");
	}
	public static void main(String[] args) 
	{
		Encapsulation call = new Encapsulation();
		call.get();

	}

	
}