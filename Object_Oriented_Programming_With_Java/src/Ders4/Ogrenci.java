package Ders4;

public class Ogrenci {
	
	public String adi;
	public int no;
	
	public Ogrenci() {
		
	}
	
	/*
	public Ogrenci(String x, int y) {
		adi = x;
		no = y;
	}
	*/
	
	public Ogrenci(String adi) {
		this.adi = adi;
		
	}
	
	public Ogrenci( int no) {
		this.no = no;
	}
	
	public Ogrenci(String adi, int no) {
		this.adi = adi;
		this.no = no;
	}
	
	
	@Override
	public String toString() {
		return "Ogrenci [adi=" + adi + ", no=" + no + "]";
	}
	
	

}
