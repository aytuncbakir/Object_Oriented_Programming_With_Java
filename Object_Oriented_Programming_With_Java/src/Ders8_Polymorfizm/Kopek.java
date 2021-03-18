package Ders8_Polymorfizm;

public class Kopek extends Hayvan {

	public Kopek(String isim) {
		super(isim);
	}
	
	public String sesCikar() {
		
		return this.getIsim() + " ses veriyor";
	}

}
