package Ders2_Ornek;

public class BankaMusterisi {

	public String adi;
	public String soyadi;
	public String medenihali;
	public String musteriNo;
	public int bakiye;
	
	public int paraCek(int cekilecekMiktar, int bakiye) {
		System.out.println("--- para cekiliyor");
		int sonBakiye = bakiye - cekilecekMiktar;
		return sonBakiye;
	}
	
	public int paraYatir(int yatirilacakMiktar, int bakiye) {
		
		int sonBakiye = bakiye + yatirilacakMiktar;
		
		return sonBakiye;
	}
	
	public void havaleEt() {
		
	}
	
}
