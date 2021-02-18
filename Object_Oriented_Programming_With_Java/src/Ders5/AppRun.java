package Ders5;

public class AppRun {

	public static void main(String[] args) {
		
		StaticDegerler.veritabaninaBaglan();
		
		

		Kedi kedi = new Kedi("mavis","tekir");
		System.out.println(kedi);
		kedi.miyavla();
		
		kedi.kork(4);
		kedi.kork(46);
		
		Kedi kedi1 = new Kedi();
		System.out.println(kedi1);
		
		// veritabanindan alcam, ya da dosyadan okuyacam
		Kedi k = new Kedi();
		// bu bilgileri bilmiyorum, baska yerden aldim.
		 String adi = "boncuk";
		 String cinsi = "van";
		 k.setAdi(adi);
		 k.setCinsi(cinsi);
		 System.out.println(k);
		 
		 
		 Kedi k1 = new Kedi("kedim");
		 k1.setCinsi(cinsi);
		 System.out.println(k1);
		 
		 
		 
		 System.out.println(StaticDegerler.sayac);
		 
		 StaticDegerler sd = new StaticDegerler();
		 StaticDegerler.sayac +=1;
		 StaticDegerler.x = 10;
		 StaticDegerler.y = "aaaa";
		
		 StaticDegerler sd1 = new StaticDegerler();
		 StaticDegerler.sayac +=1;
		 StaticDegerler.x = 110;
		 StaticDegerler.y = "bbbb";
		 
		 
		 System.out.println( StaticDegerler.sayac+" - "+StaticDegerler.y);
		 
		 NesneGlobalAlanlar nga = new NesneGlobalAlanlar();
		 System.out.println("nga: "+nga.s);
		 nga.metod1();
		 
		 
		 Defter d = new Defter();
		 d.islemTamam();
		

	}

}
