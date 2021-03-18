package Ders7_Composition;



/*
 *  COMPOSITION   : -- has a
 *  
 *  Bcycle has a front tire.
 * 
 *  Bisikletin ön tekeri vardir / ön tekere sahiptir.
 * Bisikletin arka tekeri vardir
 * Bisikletin direksiyonu vardir
 * Bisikletin koltugu vardir
 * Bisikletin pedal vardir
 * 
 * */

public class Bisiklet {
	
	
	private OnTeker onTeker;
	private ArkaTeker arkaTeker;
	private Direksiyon direksiyon;
	private ModernKoltuk modernKoltuk;
	private Pedal pedal;
	private BisikletSusu bisikletSusu;
	private Camurluk camurluk;
	
	
	public Bisiklet() {
		System.out.println("Bisiklet toplaniyor...");
	}
	
	
	public Bisiklet(OnTeker onTeker, ArkaTeker arkaTeker, Direksiyon direksiyon, 
			ModernKoltuk modernKoltuk, Pedal pedal,BisikletSusu bisikletSusu,Camurluk camurluk ) {
		System.out.println("Bisiklet toplaniyor...");
		this.onTeker = onTeker;
		this.arkaTeker = arkaTeker;
		this.direksiyon = direksiyon;
		this.modernKoltuk = modernKoltuk;
		this.pedal = pedal;
		this.bisikletSusu = bisikletSusu;
		this.camurluk = camurluk;
	}
	public ModernKoltuk getModernKoltuk() {
		return modernKoltuk;
	}


	public void setModernKoltuk(ModernKoltuk modernKoltuk) {
		this.modernKoltuk = modernKoltuk;
	}


	public OnTeker getOnTeker() {
		return onTeker;
	}
	public void setOnTeker(OnTeker onTeker) {
		this.onTeker = onTeker;
	}
	public ArkaTeker getArkaTeker() {
		return arkaTeker;
	}
	public void setArkaTeker(ArkaTeker arkaTeker) {
		this.arkaTeker = arkaTeker;
	}
	public Direksiyon getDireksiyon() {
		return direksiyon;
	}
	public void setDireksiyon(Direksiyon direksiyon) {
		this.direksiyon = direksiyon;
	}
	
	public Pedal getPedal() {
		return pedal;
	}
	public void setPedal(Pedal pedal) {
		this.pedal = pedal;
	}
	public BisikletSusu getBisikletSusu() {
		return bisikletSusu;
	}

	public void setBisikletSusu(BisikletSusu bisikletSusu) {
		this.bisikletSusu = bisikletSusu;
	}

	public Camurluk getCamurluk() {
		return camurluk;
	}

	public void setCamurluk(Camurluk camurluk) {
		this.camurluk = camurluk;
	}

	
	

}
