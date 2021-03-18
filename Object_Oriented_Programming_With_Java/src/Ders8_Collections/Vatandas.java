package Ders8_Collections;

public class Vatandas {

	
	
	private String isim;
	
	public Vatandas(String isim) {
		this.isim = isim;
	}

	public void senKimsin() {
		System.out.println(this.isim);
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	@Override
	public String toString() {
		return "Vatandas [isim=" + isim + "]";
	}
	
	
	

}
