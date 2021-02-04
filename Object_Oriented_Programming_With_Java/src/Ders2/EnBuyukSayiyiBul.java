package Ders2;

/** Ilk Java Kodumuzun Dokumantasyonu
# sayidan en buyunu bulan metod
* @author xxxx
* @version 1.0
* @since 09.01.2003
* @category ccc
* 
*/ 

public class EnBuyukSayiyiBul {

	public static void main(String[] args) {
		
		int x= 3 , y = 4, z = 5;
		int enBuyukSayi = enBuyukSayiyiBul(x,y,z);
		ekranaYaz( enBuyukSayi);

	}
	
	/** metodumuz
	* noktasi olan yordam
	* @param 3 parametre aliyor
	* @return enbuyuk sayiyi doner
	* @exception Hic istisna firlatilmiyor
	*/
	public static int enBuyukSayiyiBul(int a, int b, int c) {
		
		int enbuyuk = 0;
		
		// 1. sayiyi al
		// 2. sayiyi al
		// 1. sayi 2. den buyuk mu
		// buyukse enbuyuk 1. sayi 
			// degilse enbuyuk 2. sayi
		
		// 3. sayiyi al
		// 3. sayi enbuyukten buyuk mu
		//buyukse enbuyuk 3. sayi
			//degilse enbuyuk sayi enbuyuk
		
		if(a > b)
			enbuyuk = a;
		else
			enbuyuk = b;
		
		if(c > enbuyuk)
			enbuyuk = c;
		
		return enbuyuk;
		
	}
	
	public static void ekranaYaz(int gelenSonuc) {
		System.out.println(gelenSonuc);
	}
	

}
