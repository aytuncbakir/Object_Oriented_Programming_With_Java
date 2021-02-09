package Ders2_Ornek;

public class BankaSimulasyon {


	public static void main(String [] args) {	
		/*
		BankaMusterisi bankaMusterisi = new BankaMusterisi();
		
		bankaMusterisi.adi = "Asaf";
		bankaMusterisi.soyadi = "Saf";
		bankaMusterisi.medenihali = "erkek";
		bankaMusterisi.bakiye = 10000;
		
		System.out.println("--- para cekilecek");
		int sonBakiye = bankaMusterisi.paraCek(1000, bankaMusterisi.bakiye);
		System.out.println("--- para cekildi");
		System.out.println(sonBakiye);
		*/
		
		
		
		BankaMusterisi bm1 = new BankaMusterisi();
		
		bm1.adi = "Asaf";
		bm1.bakiye = 10000;
		
		
		BankaMusterisi bm2 = new BankaMusterisi();
		
		bm2.adi = "Mesut";
		bm2.bakiye = 30000;
		
		bm1.havaleEt(1000, bm1, bm2);
		
		System.out.println("Musteri1 :"+bm1.bakiye);
		System.out.println("Musteri2 :"+bm2.bakiye);
	}
}
