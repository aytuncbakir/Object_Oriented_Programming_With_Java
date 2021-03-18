package Ders8_Polymorfizm;



public class Polymorfizm {
	
	
	public static void sesVer(Hayvan h) {
		System.out.println(h.sesCikar());
	}

	
	public static void main(String[] args) {
		
		
		Hayvan hayvan = new Hayvan("Hayvan");
		
		String ses = hayvan.sesCikar();
		//System.out.println(ses);
		//System.out.println(hayvan.sesCikar());
		
		//sesVer(hayvan);
		
		Kedi kedi = new Kedi("Mavis");
		//System.out.println(kedi.sesCikar());
		//sesVer(kedi);
		
		Kopek kopek = new Kopek("Comar");
		//System.out.println(kopek.sesCikar());
		//sesVer(kopek);
		
		Kus kus = new Kus("Boncuk");
		//System.out.println(kus.sesCikar());
		//sesVer(kus);
		
		Hayvan polyHayvan = new Kedi("Tekir");
		//System.out.println(polyHayvan.sesCikar());
		
		polyHayvan =  new Kopek("Karabas");
		//System.out.println(polyHayvan.sesCikar());
		
		// Object sinifi tum siniflarin atasi
		Object obj = new Hayvan("Hayvan");
		//System.out.println(((Hayvan) obj).sesCikar());
		
		
	}

}
