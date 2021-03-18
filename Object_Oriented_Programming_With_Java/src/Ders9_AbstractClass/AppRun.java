package Ders9_AbstractClass;

public class AppRun {

	public static void main(String[] args) {
		
		Ders ders = new Matematik();
		dersYaz( ders);
		
		Ders ders1 = new Fizik();
		dersYaz( ders1);
		Ders ders2 = new Kimya();
		dersYaz( ders2);

	}
	
	public static void dersYaz(Ders ders) {
		
		System.out.println(ders.getAdi());
	}
	

}
