package Ders5;

public class Kedi {

	// Global degiskenler
	public String adi;
	public String cinsi;

	// Default constructor
	public Kedi() {
		this("tom", "kedi");
	}

	/*
	 * boyle kullanilmaz public Kedi(String x, String y) { adi = x; cinsi = y; }
	 */

	public Kedi(String adi) {

		this.adi = adi;

	}

	public Kedi(String adi, String cinsi) {

		this.adi = adi;
		this.cinsi = cinsi;
		// return; gerek yok
	}
	
	public void tirman() {
		System.out.println("Tirman");
	}
	
	public void miyavla() {
		
		System.out.println("Miyav");
	}
	
	public void kork(int korkuDerecesi) {
		if(korkuDerecesi > 5)
			kac();
		else
			miyavla();
	}
	
	public void kac() {
		System.out.println("kac");
	}

	public void merhaba() {

		System.out.println("Merhaba");
	}
	
	public static void topla(int a, int b) {
		
		System.out.println(a+b);
		
	}

	@Override
	public String toString() {
		this.merhaba(); // this olmadanda calisir
		return "Kedi [adi=" + adi + ", cinsi=" + cinsi + "]";

	}

	// sonra deginilecek

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getCinsi() {
		return cinsi;
	}

	public void setCinsi(String cinsi) {
		this.cinsi = cinsi;
	}

}
