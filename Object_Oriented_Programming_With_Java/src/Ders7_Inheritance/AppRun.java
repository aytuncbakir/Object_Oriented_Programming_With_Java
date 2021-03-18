package Ders7_Inheritance;

public class AppRun {

	public static void main(String[] args) {
		
		Hayvan hayvan = new Hayvan("xxx","yyy","zzz");
		Kedi kedi = new Kedi("Tekir","4","Karada Yasar");
		
		//hayvan.tehlikeVar();   --- casting 
		
		kedi.setTuru("Van");
		//kedi.tehlikeVar();
		//kedi.dortAyakUstuneDus();
		//System.out.println(kedi);

	}

}
