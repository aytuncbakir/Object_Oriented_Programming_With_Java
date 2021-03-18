package Ders7_Composition;

public class AppRun {

	public static void main(String[] args) {
		
		//Bisiklet bisiklet2 = new Bisiklet( onTeker,  arkaTeker,  direksiyon,  koltuk,  pedal);
		Bisiklet bisiklet = new Bisiklet();
		 
		ArkaTeker arkaTeker = new ArkaTeker();
		bisiklet.setArkaTeker(arkaTeker);
		
		OnTeker onTeker = new OnTeker();
		bisiklet.setOnTeker(onTeker);
		
		Direksiyon direksiyon = new Direksiyon();
		bisiklet.setDireksiyon(direksiyon);
		
		Pedal pedal = new Pedal();
		bisiklet.setPedal(pedal);
		
		ModernKoltuk modernKoltuk = new ModernKoltuk();
		bisiklet.setModernKoltuk(modernKoltuk);
		
		BisikletSusu bisikletSusu = new BisikletSusu();
		bisiklet.setBisikletSusu(bisikletSusu);
		
		Camurluk camurluk = new Camurluk();
		bisiklet.setCamurluk(camurluk);
		
		System.out.println("------------------------------");
		
		bisiklet.getDireksiyon().sagaDon();
		
		

	}

}
