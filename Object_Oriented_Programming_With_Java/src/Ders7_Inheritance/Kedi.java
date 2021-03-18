package Ders7_Inheritance;

public class Kedi extends Hayvan {

	public Kedi(String turu, String ayakSayisi, String yasamAlani) {
		super(turu, ayakSayisi, yasamAlani);
		
	}
	
	public void dortAyakUstuneDus() {
		System.out.println("dort ayak ustunde dustum");
	}

	@Override
	public String toString() {
		return "Kedi [getTuru()=" + getTuru() + ", getAyakSayisi()=" + getAyakSayisi() + ", getYasamAlani()="
				+ getYasamAlani() + "]";
	}
	
	
	

}
