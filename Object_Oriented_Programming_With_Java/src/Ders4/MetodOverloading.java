package Ders4;

public class MetodOverloading {
	
	public int topla(int a, int b) {
		return a + b;
	}
	
	public void topla(int a, double b) {
		System.out.println( a + b);
	}
	
	public double topla (double a, int b) {
		return a + b;
	}
	
	public double topla(int b, int a, int c) {
		return a + b + c;
	}
	
	public void dosyaAc(int resim) {
		
		System.out.println("Resim Ac");
	}
	
	public void dosyaAc(double muzik) {
		System.out.println("Muzik Ac");
	}
	
	public void dosyaAc(float video) {
		System.out.println("Video Ac");
	}
	
	
}
