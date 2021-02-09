package Ders4;

public class AppRun {

	public static void main(String[] args) {
		
		Ogrenci ogr = new Ogrenci();
		
		ogr.adi = "Asaf";
		ogr.no =123;
		
		Ogrenci ogr1 = new Ogrenci("Ali",8);
		
		
		Ogrenci ogr2 = new Ogrenci("Ahmet");
		ogr2.no = 234;
		
		Ogrenci ogr3 = new Ogrenci(203);
		ogr3.adi = "fatma";
		
		//System.out.println(ogr.adi +" "+ogr.no);
		System.out.println(ogr);
		System.out.println(ogr1);
		System.out.println(ogr2);
		System.out.println(ogr3);
		
		MetodOverloading mt = new MetodOverloading();
		
		System.out.println(mt.topla(12, 13));
		System.out.println(mt.topla(12, 11, 13));
		
		mt.dosyaAc(12);
		mt.dosyaAc(12.0);
		mt.dosyaAc(12.0f);
	}

}
