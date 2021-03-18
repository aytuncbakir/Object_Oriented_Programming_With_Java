package Ders7_Inheritance3;

public class Kullanici extends Kisi{

	private String kullaniciAdi;
	private String sifre;
	
	public Kullanici(String name, String soyadi, String kullaniciAdi, String sifre) {
		super(name, soyadi);
		this.kullaniciAdi = kullaniciAdi;
		this.sifre = sifre;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	@Override
	public String toString() {
		return "Kullanici [kullaniciAdi=" + kullaniciAdi + ", sifre=" + sifre + ", getName()=" + getName()
				+ ", getSoyadi()=" + getSoyadi() + "]";
	}

	

	
	
	
}
