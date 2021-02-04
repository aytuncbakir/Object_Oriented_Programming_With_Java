package Ders2;

public class HesapMakinesi {
	
	public static void main(String[] args) {
	
		
		int x = 5; // deger atamasi yapildi
		
		int a = 3, b= 4, c=5;
	
		int y = 12;
		
		int gelenSonuc = toplama( 7,  16);
		ekranaYaz( gelenSonuc);
	
		gelenSonuc = cikarma( 27,  16);
		ekranaYaz( gelenSonuc);
		
		gelenSonuc = carpma( 27,  16);
		ekranaYaz( gelenSonuc);
		

		
		gelenSonuc = boyutDondur("adana");
		ekranaYaz( gelenSonuc);
		
		
		String kelime = "kelime";
		gelenSonuc = boyutDondur(kelime);
		ekranaYaz( gelenSonuc);
		
		
	
	}
	
	/*
	 
	dönüşTipi metodAdi(  parametre listesi  ) {
	 
	 	Metodun gövdesinde islemler yapilir

	 }
	  
	  */
	
	
	public static void ekranaYaz(int gelenSonuc) {
		System.out.println(gelenSonuc);
	}
	
	
	// toplama metodu   x = 7, y = 16
	public static int toplama(int x, int y) {
		int sonuc = x + y;
		return sonuc;
	}
	
	
	// cikarma metodu   x = 7, y = 16
	public static int cikarma(int x, int y) {
		int sonuc = x - y;
		return sonuc;
	}
	
	// carpma metodu   x = 27, y = 16
	public static int carpma(int x, int y) {
		int sonuc = x * y;	
		return sonuc;
	}
	
	public static int boyutDondur(String kelime) {
		return kelime.length() ;
	} 
	

}


