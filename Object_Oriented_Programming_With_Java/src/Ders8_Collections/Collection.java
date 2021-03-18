package Ders8_Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Collection {

	
	public static void main(String[] args ) {
		
		
		List<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ccc");
		list.add("bbb");
		
		//list.clear();
		//list.remove(0);
		
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("-----------------------------------------\n");
		
		Set<String> set  = new HashSet();
		set.add("111");
		set.add("222");
		set.add("111");
		
		iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("-----------------------------------------\n");
		
		Queue <String> q = new LinkedList<String>();
		
		q.add("1");
		q.add("2");
		q.add("3");
		q.poll();
		
		
		iter = q.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("-----------------------------------------\n");
		
		
		Stack <String> s = new Stack<String>();
		
		s.add("1111111");
		s.add("2222222");
		s.add("3333333");
		s.pop();
		s.push("444444");
		

		iter = s.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("-----------------------------------------\n");
		
		
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1121221, "Ali");
		map.put(3434343, "Salih");
		map.put(5656565, "Ayse");
		map.put(8989898, "Fatma");
		map.put(112121, "Ali");
		
		Set keySet = map.keySet();
		iter = keySet.iterator();
		
		while(iter.hasNext()) {
			System.out.println(map.get(iter.next()));
		}
		
		System.out.println("-----------------------------------------\n");
		
		List<Ogrenci> ogrenciListesi = new ArrayList<Ogrenci>();
		
		Ogrenci ogr1 = new Ogrenci("Ogrenci1");
		Ogrenci ogr2 = new Ogrenci("Ogrenci2");
		Ogrenci ogr3 = new Ogrenci("Ogrenci3");
		
		ogrenciListesi.add(ogr1);
		ogrenciListesi.add(ogr2);
		ogrenciListesi.add(ogr3);
		
		Iterator<Ogrenci> iter1 = ogrenciListesi.iterator();
		
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
							//ogr1.getIsim()
		System.out.println(ogrenciListesi.get(0).getIsim());
		
		System.out.println("-----------------------------------------\n");
		

		List<Vatandas> vatandasListesi = new ArrayList<Vatandas>();
		
		Vatandas vtd = new Vatandas("Riza");
		Ogrenci ogr4 = new Ogrenci("Ogrenci4");
		Ogrenci ogr5 = new Ogrenci("Ogrenci5");
		Ogrenci ogr6 = new Ogrenci("Ogrenci6");
		
		Ogretmen ogt1 = new Ogretmen("Ogretmen1");
		Ogretmen ogt2 = new Ogretmen("Ogretmen2");
		Ogretmen ogt3 = new Ogretmen("Ogretmen3");
		
		//Yabanci ybn = new Yabanci();
		
		//vatandasListesi.add(ybn);
		
		vatandasListesi.add(vtd);
		vatandasListesi.add(ogr1);
		vatandasListesi.add(ogr2);
		vatandasListesi.add(ogr3);
		vatandasListesi.add(ogt1);
		vatandasListesi.add(ogt2);
		vatandasListesi.add(ogt3);
		
		
		
		Iterator<Vatandas> iter2 = vatandasListesi.iterator();
		
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		
		int i = 0;
		while(i < vatandasListesi.size()) {
			System.out.println(vatandasListesi.get(i).getIsim());
			i++;
		}
		
		
		for(int j = 0; j < vatandasListesi.size();j++) {
			System.out.println(vatandasListesi.get(j).getIsim());
			
		}
		
							
		
		System.out.println("-----------------------------------------\n");
		
		
	}
}
