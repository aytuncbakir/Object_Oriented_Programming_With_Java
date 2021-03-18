package Ders7_Inheritance;


/*
 *   KALITIM - is a iliskisidir
 * 
 * 		Cat is a animal.
 * 
 * 		Kedi bir hayvandir.   --- dir 
 * 
 * 
 * */


public class Hayvan {
	
	private String turu;
	private String ayakSayisi;
	private String yasamAlani;
	
	
	public Hayvan(String turu, String ayakSayisi, String yasamAlani) {
		this.turu = turu;
		this.ayakSayisi = ayakSayisi;
		this.yasamAlani = yasamAlani;
	}


	public String getTuru() {
		return turu;
	}


	public void setTuru(String turu) {
		this.turu = turu;
	}


	public String getAyakSayisi() {
		return ayakSayisi;
	}


	public void setAyakSayisi(String ayakSayisi) {
		this.ayakSayisi = ayakSayisi;
	}


	public String getYasamAlani() {
		return yasamAlani;
	}


	public void setYasamAlani(String yasamAlani) {
		this.yasamAlani = yasamAlani;
	}
	
	public void tehlikeVar() {
		System.out.println(" Guvenli bir yere kac...");
	}
	
	
	
	

}
