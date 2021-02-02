package Ders1_Ornek;

public class ApplicationRun {

	public static void main(String[] args) {
		Yazar yzr = new Yazar();
		
		Kitap ktp = new Kitap();
		
		yzr.yazdigiKitap = ktp;
		
		KitapCilt kc = new KitapCilt();
		
		ktp.cilt = kc;
		
		System.out.println(yzr.adiSoyadi);
		System.out.println(yzr.yazdigiKitap.adi);
		System.out.println(yzr.yazdigiKitap.isbn);
		System.out.println(yzr.yazdigiKitap.turu);
		System.out.println(yzr.yazdigiKitap.yazarAdi);
		System.out.println(yzr.yazdigiKitap.cilt.ciltNo);
		//System.out.println(ktp);
		
		
		
		
		
	}

}
