package Ders1;


public class Konu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Bu bir yorum satiridir.
		
		/*Bu bir yorum satiridir.*/ 
		
		
		Insan insan = new Insan();
		
		
//		  System.out.println(insan.adi); 
//		  System.out.println(insan.soyadi);
		 
		
		boolean mantiksalDeger = false;
		char ch = 0;
		
		//System.out.println(mantiksalDeger);
		//System.out.println(ch);
		
		Insan insan1 = new Insan();
		
		System.out.println(insan1.adi);
		System.out.println(insan1.soyadi);
		System.out.println(insan1.yasi);
		System.out.println(insan1.medeniHali);
		
		insan1.adi = "Cafer";
		insan1.medeniHali = false;
		System.out.println("-----------------");
		System.out.println(insan1.adi);	
		System.out.println(insan1.medeniHali);	
		// System.out.println(insan1.dini);	

	}

}
