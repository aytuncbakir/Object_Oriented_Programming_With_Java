package Ders2_Ornek;

public class Kisi {
	
	public String adi;
	public String soyadi;
	public String gozRengi;
	public String cinsiyeti;
	
	
	public  void beyin(int kod) {	
		if(kod == 1)
			kos();
		else if (kod == 2)
			yuru();
		else if (kod == 3)
			uyu();
	}

	public  void kos() {	
		System.out.println("ayaklara ileti gonderildi ... kosuyorum...");
	}
	
	public  void yuru() {
		System.out.println("yuruyorum...");	
	}
	
	public  void uyu() {	
		System.out.println("uyuyorum...");
	}

}
