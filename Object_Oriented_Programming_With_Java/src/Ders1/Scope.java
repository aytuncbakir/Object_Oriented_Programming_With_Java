package Ders1;

public class Scope {

	public static void main(String[] args) 
	
	{
		int a = 122;
		//int b = 23;
		System.out.println("a="+a);
		if(true) {
			int b = 34;
			System.out.println("a="+a);
			System.out.println("b="+b);
		}
		System.out.println("a="+a);
		//System.out.println("b="+b);
	}
	
}

