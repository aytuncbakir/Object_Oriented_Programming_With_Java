package Ders9_ExceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		String hata = null;
		
		
		try {
			
			metod();
			
			List<String> list = new ArrayList<String>();
			
			list.add("aa");
			list.add("bb");
			list.add("bb");
			
			System.out.println(list.get(6));
			
			String s = null;
			s.charAt(5);
			
			
		}catch (IndexOutOfBoundsException e) {
			System.out.println("--IndexOutOfBoundsException--");
			hata = "--IndexOutOfBoundsException--";
			e.printStackTrace();
		}catch ( NullPointerException e) {
			System.out.println("--NullPointerException--");
			hata = "--NullPointerException--";
			e.printStackTrace();
		}catch ( Exception e) {
			System.out.println("--IndexOutOfBoundsException--");
			hata = "--IndexOutOfBoundsException--";
			e.printStackTrace();
		}finally {
			System.out.println("Hata meydana geldi..."+hata);
			
		}
		

	}
	
	private static void metod() throws Exception{
		
		List<String> list = new ArrayList<String>();
		
		list.add("aa");
		list.add("bb");
		list.add("bb");
		
		System.out.println(list.get(6));
	}

}
