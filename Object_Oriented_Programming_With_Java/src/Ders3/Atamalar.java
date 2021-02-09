package Ders3;

public class Atamalar {
	
	public static void main(String [] args) {	
	
		int a;
		int b,c,d;
		int e = 5, f =6;
		
		a = 5;
		
		Employee emp = new Employee();
		emp.name = "Hasan";
		emp.salary = 3451;
		
		Employee emp1 = new Employee();
		emp1.name = "Selim";
		emp1.salary = 7654;
		
		System.out.println(emp.name +" "+emp.salary );
		System.out.println(emp);
		System.out.println(emp1.name +" "+emp1.salary );
		System.out.println(emp1);
		
		//emp = emp1;
		System.out.println("---------------");
		System.out.println(emp);
		System.out.println(emp1);
		System.out.println(emp.name +" "+emp.salary );
		System.out.println(emp1.name +" "+emp1.salary );
		
		Employee tmp;
		
		tmp = emp;
		emp = emp1;
		emp1 = tmp;
		System.out.println();
		System.out.println("---------------");
		System.out.println(emp.name +" "+emp.salary );
		System.out.println(emp1.name +" "+emp1.salary );
		
		int sayi1 = 12;
		int mod = 7;
		
		int sonuc = 12 % 13;
		System.out.println(sonuc);
		
		double x = 41111;
		int y ;
		
		y = (int) x;
		System.out.println(y);
		
		int t = 4111;
		double z ;
		
		z = t;
		System.out.println(y);
		
		String str1 = "Ahmet";
		String str2 = "Sam";
		String str3 = str1+" "+str2;
		String str4 = "12";
		int k = 3;
		String str5 = "00";
		System.out.println(str1+" "+str2);
		System.out.println(str3);
		System.out.println(str4+k+str5);
		
		
		int sonraArtir = 1;
		
		System.out.println(sonraArtir++);
		System.out.println(sonraArtir);
		System.out.println("---------------");
		int onceArtir = 1;
		
		System.out.println(++onceArtir);
		System.out.println(onceArtir);
		
		System.out.println("---------------");
		int sonraAzalt = 1;
		
		System.out.println(sonraAzalt--);
		System.out.println(sonraAzalt);
		System.out.println("---------------");
		int onceAzalt = 1;
		
		System.out.println(--onceAzalt);
		System.out.println(onceAzalt);
		
		System.out.println(3 > 5);
		System.out.println(3 < 5);
		System.out.println(3 != 5);
		System.out.println();
		System.out.println(3 == 5);
		
		System.out.println(3 == 5 && 3 <= 5);
		
		int i = 0;
		//i = i + 1;
		i += 2;
		System.out.println("---------------");
		System.out.println(i);
		
		System.out.println("while döngusu");
		int kosul = 10, sayac = 1;
		while(sayac < kosul) {
			
			System.out.println(sayac);
			
			sayac++;
		}
		
		
		System.out.println("do while döngusu");
		int kosull = 10, sayacc = 10;
		do {
			System.out.println(sayacc);
			
			sayacc++;
		}
		while(sayacc < kosull);
			
		System.out.println("for döngusu");
		
		for(int syc = 1; syc < 10; syc++) {
			System.out.println(syc);
		}
		
		
		for(; ; ) {
			
			if(3 < 5) {
				System.out.println("3 < 5");
			 break;
			}
		}
		
		
		while(true) {
			
			System.out.println();
			break;
		}
		
	for( i = 1; i <10; i++ ) {
		
			if(i == 5) {
			 continue;
			}else {
				System.out.println(i);
			}
	}
	int snc = 0;
	 
	
		if((3 == 5) && (3 <= 5)) {
			
			System.out.println();
		}
	
		
		if((3 < 5) && (3 == 5)) {
			
			System.out.println();
		}
		
		String deger = 3 > 5 ? "dogru" : "yanlis";
		System.out.println(deger);
		
		
	}

}
