package Ders5;

public class Defter {
	
	static int x = 12;
    static {
		
		System.out.println("ilk calistim");
		System.out.println(x);
	}
	
	
	
	Kagit k1 = new Kagit(1);
	
	public Defter() {
		System.out.println("DEfter yapilandirici");
		k2 = new Kagit(33);
	}
	
	Kagit k2 = new Kagit(2);
		
		
	public void islemTamam() {
		System.out.println("Islem tamam");
	}
		
	Kagit k3 = new Kagit(3);
	
	

}
