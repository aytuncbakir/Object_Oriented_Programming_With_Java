package Ders2_Ornek;

public class BankaSimulasyon {


	public static void main(String [] args) {	
		BankaMusterisi bankaMusterisi = new BankaMusterisi();
		
		bankaMusterisi.adi = "Asaf";
		bankaMusterisi.soyadi = "Saf";
		bankaMusterisi.medenihali = "erkek";
		bankaMusterisi.bakiye = 10000;
		
		System.out.println("--- para cekilecek");
		int sonBakiye = bankaMusterisi.paraCek(1000, bankaMusterisi.bakiye);
		System.out.println("--- para cekildi");
		System.out.println(sonBakiye);
	}
}
