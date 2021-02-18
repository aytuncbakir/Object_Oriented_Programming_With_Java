package Ders6_Encapsulation;

public class AppRun {

	public static void main(String[] args) {
		
		Calisan calisan = new Calisan("Meliha Has","Teknisyen",1221);
	
		calisan.setAdi("Meliha Akman");
		calisan.setUnvan("BasTeknisyen");
		calisan.setNo(123);
		
		
		System.out.println(calisan.getAdi());
		System.out.println(calisan.getUnvan());
		System.out.println(calisan.getNo());
		
		System.out.println(calisan);
		
		// String baglandiMi = (new VeritabaninaBaglan()).baglan();
		
		
		String baglandiMi;
		VeritabaninaBaglan vtb = new VeritabaninaBaglan();
		baglandiMi = vtb.baglan();
		
		System.out.println(baglandiMi);

	}

}
