package Ders9_AbstractClass;

public class Fizik extends Ders{

	public Fizik() {
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String getAdi() {
		// TODO Auto-generated method stub
		return "Fizik";
	}
	
	public int getSinifNo() {
		return super.getSinifNo();
	}

}
