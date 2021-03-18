package Ders8_Interface;

public class Kumanda implements KanalArtirAzalt, SesArtirAzalt {

	public Kumanda() {
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public void sesArtir(int sesSeviyesi) {
		System.out.println(++sesSeviyesi);
		
	}

	@Override
	public void sesAzalt(int sesSeviyesi) {
		System.out.println(--sesSeviyesi);
		
	}
	
	@Override
	public void kanalAzalt(int kanal) {
		System.out.println(--kanal);
		
	}

	@Override
	public void kanalArtir(int kanal) {
		System.out.println(++kanal);
		
	}


}
