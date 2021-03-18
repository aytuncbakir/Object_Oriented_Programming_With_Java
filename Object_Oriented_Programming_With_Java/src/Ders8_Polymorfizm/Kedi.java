package Ders8_Polymorfizm;

public class Kedi extends Hayvan {

	public Kedi(String isim) {
		super(isim);
	}
	
	public String sesCikar() {
		
		return this.getIsim() + " ses veriyor";
	}
	
	

}
