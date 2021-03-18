package Ders11_StringOperations;

public class StringOperations {

	public static void main(String[] args) {


		String str = "abc";
		
		int sonuc = str.compareTo("aazffa");
		System.out.println(sonuc);
		
		if(str.compareTo("abaa") == 0)
			System.out.println("Stringler esit");
		else
			System.out.println("Stringler esit degil");
		
		
		int length = str.length();
		System.out.println(length);
		
		char ch = str.charAt(2);
		System.out.println(ch);
		
		
		if(str.equals("abc"))
			System.out.println("Stringler esit");
		else
			System.out.println("Stringler esit degil");
		
		String email = "aaa@aaa.com";
		if(email.contains("@"))
			System.out.println("True ok");
		else
			System.out.println("false not ok");
		
		String splitStr = "aaa,bbb,ccc";
		String[] splitted = splitStr.split(",");
		
		int i = 0;
		while(i < splitted.length) {
			System.out.println(splitted[i]);
			i++;
			
		}
		
		if("".isEmpty())
			System.out.println("empty");
		else
			System.out.println("not empty");
		
		String lowStr = "AVDD";
		System.out.println(lowStr.toLowerCase());
		
		String upStr = "sdsdsd";
		System.out.println(upStr.toLowerCase());
		
		String trimStr = "aaaaa  ";
		System.out.println(trimStr.equals("aaaaa  "));
		System.out.println(trimStr.length());
		trimStr = trimStr.trim();
		System.out.println(trimStr.length());
		System.out.println(trimStr.equals("aaaaa  "));
	}

}
