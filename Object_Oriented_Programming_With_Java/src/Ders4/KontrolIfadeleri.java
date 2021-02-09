package Ders4;



public class KontrolIfadeleri {
	
	public static void main (String[] args) {
				
		int secim = 3 > 5 ? 1 : 0;
		
		switch(secim) {
			case 0 :
				System.out.println("aaa");
				break;
			case 1 :
				System.out.println("bbb");
				break;
			case 2 :
			System.out.println("ccc");
				break;
			default:
				System.out.println("Gecersiz deger ");
				break;
		}
		/*
		
		
		*/
		
		for(int i = 0; i<5;i++) {
			
			for(int j = 0; j<5;j++) {
				
					if(j == 3)
						break;
					//System.out.println(j);
			}
			
		}
		
		donguKir:
		for(int i = 0; i<5;i++) {
			
			for(int j = 0; j<5;j++) {
				
					if(j == 3)
						break donguKir;
					//System.out.println(j);
			}
			
		}
		
		pasGec:
		for(int i = 0; i<5;i++) {
			
			for(int j = 0; j<5;j++) {
				
					if(j == 3)
						continue pasGec;
					//System.out.println(j);
			}
			
		}
		
		int sonuc =  topla(1,2);
		System.out.println(sonuc);
		
		System.out.println(topla(71,8));
		
		System.out.println(topla(2,3));
		
		yazdir(4) ;
		yazdir(5) ;
		System.out.println("akis buradan devam eder");
		
		kareCiz();
		ucgenCiz();
		tersUcgenCiz();
		
		/*
			  *
			 **
			***
		   ****
		   
		   */
	}
	
	public static void tersUcgenCiz1() {
		for(int i = 0; i<4;i++) {
			
			for(int j = 0; j<4;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	public static void eskenarUcgenCiz() {
		for(int i = 0; i<4;i++) {
			
			for(int j = 0; j<4;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	public static void kareCiz() {
		for(int i = 0; i<4;i++) {
			//System.out.print("i:"+i+"/ j:");
			for(int j = 0; j<4;j++) {
				
					System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	public static void tersUcgenCiz() {
		for(int i = 0; i<4;i++) {
			//System.out.print("i:"+i+"/ j:");
			for(int j = i; j<4;j++) {
				
					System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	public static void ucgenCiz() {
		for(int i = 0; i<4;i++) {
			//System.out.print("i:"+i+"/ j:");
			for(int j = 0; j<=i;j++) {
				
					System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	
	
	public static int topla(int a, int b) {
		//int c = a+b;
		//return c;
		//return  a+b;
		
		if(a+b < 5)
			return 1;
		if(a+b > 5)
			return 0;
		if(a+b == 5)
			return -1;
		
		return -2;
	}
	
	public static void yazdir(int a) {
		
		if(a == 5)
			return;
		
		System.out.println(a);
	}
	
	

}
