package Ders1_Odev1;

public class ApplicationRun {

	public static void main(String[] args) {
		
		// ogr reference
		Ogrenci ogr = new Ogrenci();
		ogr.adi = "Ali";
		ogr.soyadi = "Han";
		ogr.no = "023232";
		
		Ders drs = new Ders();
		drs.adi = "Matematik";
		drs.kodu = "2323121";
		
		ogr.ders = drs;
		
		Ogrenci ogr2;
		
		ogr2 = ogr;
		
		System.out.println(ogr);
		System.out.println(ogr2);
		System.out.println(drs);
		
		
		System.out.println(ogr.adi);
		System.out.println(ogr.soyadi);
		System.out.println(ogr.no);
		System.out.println(ogr.ders.adi);
		System.out.println(ogr.ders.kodu);
		
		

	}

}
