package SWap_Two_IntegerValues;

public class EX_OR_Operation_Without_using_thirdVariable {

	public static void main(String[] args) 
	{


		int a = 2,b = 3;
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("a:" +a);
		System.out.println("b:" +b);
		
	}

}
