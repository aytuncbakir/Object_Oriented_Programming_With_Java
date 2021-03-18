package Ders9_AbstractClass;

public class Kimya extends Ders{

	public Kimya() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getAdi() {
		// TODO Auto-generated method stub
		return "Kimya";
	}
	
	public int getSinifNo() {
		return super.getSinifNo();
	}

}
