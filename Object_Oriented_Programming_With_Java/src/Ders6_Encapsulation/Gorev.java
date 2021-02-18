package Ders6_Encapsulation;

public class Gorev {
	
	private String adi;
	private String konu;
	private int no;
	
	public Gorev() {
	
	}
	
	public Gorev(String adi, String konu, int no) {
		this.adi = adi;
		this.konu = konu;
		this.no = no;
	}

	@Override
	public String toString() {
		return "Gorev [adi=" + adi + ", konu=" + konu + ", no=" + no + "]";
	}
	
	
	
	
	
	

}
