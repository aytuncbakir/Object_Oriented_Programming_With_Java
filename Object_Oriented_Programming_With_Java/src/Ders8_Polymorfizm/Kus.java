package Ders8_Polymorfizm;

public class Kus extends Hayvan {

	public Kus(String isim) {
		super(isim);
	}

	public String sesCikar() {
		
		return this.getIsim() + " ses veriyor";
	}
}
