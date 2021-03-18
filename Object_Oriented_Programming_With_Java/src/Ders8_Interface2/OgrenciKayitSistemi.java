package Ders8_Interface2;

public class OgrenciKayitSistemi implements VeritabaniIslemleri{

	

	@Override
	public  void baglan(VeriTabaniBaglanti baglanti){
		baglanti.veritabaninaBaglan();
		

	}

	@Override
	public  void kaydet(Ogrenci ogr) {
		System.out.println(ogr);
		
	}

	@Override
	public  void sil(Ogrenci ogr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public  void guncelle(Ogrenci ogr) {
		// TODO Auto-generated method stub
		
	}

}
