package Ders6_Encapsulation;

public class Calisan {
	
	private String adi;
	private String unvan;
	private int no;
	
	public Calisan() {
	
	}

	public Calisan(String adi, String unvan, int no) {
		this.adi = adi;
		this.unvan = unvan;
		this.no = no;
	}
	
	public String getAdi() {
		return this.adi;
	}
	
	public String getUnvan() {
		return this.unvan;
	}
	
	public int getNo() {
		return this.no;
	}
	
	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	

	@Override
	public String toString() {
		return "Calisan [adi=" + adi + ", unvan=" + unvan + ", no=" + no + "]";
	}
	
	

}
