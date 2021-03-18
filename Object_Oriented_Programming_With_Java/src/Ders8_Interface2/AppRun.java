package Ders8_Interface2;

public class AppRun {

	
public static void main(String[] args) {
		
	
	OgrenciKayitSistemi oks = new OgrenciKayitSistemi();
		 
		Ogrenci ogr = new Ogrenci("Hakki Bulut");
		
		VeriTabaniBaglanti vtb = new SQLVTBaglan();
		oks.baglan(vtb);
		oks.kaydet(ogr);

	}
}
