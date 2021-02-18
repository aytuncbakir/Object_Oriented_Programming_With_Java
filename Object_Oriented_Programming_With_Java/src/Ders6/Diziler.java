package Ders6;

public class Diziler {
	
	public static void main (String [] args ) {
		
		int [] dizi;
		dizi = new int[5];
		
		int [] dizi1 = new int[5];
		
		double [] dizi2 = new double[5];
		
		String [] dizi3 = new String[5];
		
		dizi3[0] = "d0";
		dizi3[1] = "d1";
		dizi3[2] = "d2";
		dizi3[3] = "d3";
		dizi3[4] = "d4";
		
		//System.out.println(dizi3[2]);
		
		int [] dizi4 = {0,1,2,3,4};
		
		//System.out.println(dizi4[3]);
		
		DiziElemani d1 = new DiziElemani("deger1");
		DiziElemani d2 = new DiziElemani("deger2");
		DiziElemani d3 = new DiziElemani("deger3");
		
		DiziElemani[] degerler = {d1,d2,d3};
		
		
		
		//System.out.println(degerler[2]);
		
		//for(int i = 0; i < degerler.length; i++)
		//	System.out.println(degerler[i]);
		
		DiziElemani[] degerler2 = new DiziElemani[3];
		
		
		for(int i = 0; i < degerler.length; i++)
			degerler2[i] = degerler[i];
		
		for(int i = 0; i < degerler2.length; i++)
			System.out.println("degerler2 dizisi"+degerler2[i]);
		
		
		DiziElemani[] degerler3 = {d1,d2,d3};
		DiziElemani[] degerler4 = new DiziElemani[5];
		
		System.arraycopy(degerler3, 0, degerler4, 0, degerler3.length);
		
		for(int i = 0; i < degerler4.length; i++)
			System.out.println("*** dizisi"+degerler4[i]);
		
		
		//ArrayIndexOutOfBoundsException
		//for(int i = 0; i <= degerler4.length; i++)
			//System.out.println("*** dizisi"+degerler4[i]);
		
		//NullPointerException
		//System.out.println((degerler4[3]).deger);
		
		
		//NullPointerException
		//int [] dizi6 = null ;
		//System.out.println(dizi6[4]);
		
		// IKI BOYUTLU DIZILER
		int [][] dizi7 = {
				{1,2,3},
				{4,5,6}
		};
		
		int [][] dizi8 = new int[3][4];
		
		int [][] dizi9 = new int[2][3];
		
		dizi9 [0][0] = 1;
		dizi9 [0][1] = 2;
		dizi9 [0][2] = 3;
		
		dizi9 [1][0] = 4;
		dizi9 [1][1] = 5;
		dizi9 [1][2] = 6;
		
		for(int i = 0; i< dizi7.length; i++) {
			for(int j = 0; j< dizi7[i].length; j++) {
				
				System.out.print(dizi7[i][j]+" ");
				
			}
			System.out.println();
		
		}
		
		
		int[][][] dizi10 = new int[2][2][3] ;
		
		dizi10[0][0][0] = 1;
		dizi10[0][0][1] = 2;
		dizi10[0][0][2] = 3;
		
		dizi10[0][1][0] = 4;
		dizi10[0][1][1] = 5;
		dizi10[0][1][2] = 6;
		
		dizi10[1][0][0] = 7;
		dizi10[1][0][1] = 8;
		dizi10[1][0][2] = 9;
		
		dizi10[1][1][0] = 10;
		dizi10[1][1][1] = 11;
		dizi10[1][1][2] = 12;
		
		for(int x = 0; x< dizi10.length; x++) {
			for(int y = 0; y< dizi10[x].length; y++) 
				for(int z = 0; z< dizi10[x][y].length; z++) 
					System.out.print(dizi10[x][y][z]+" ");
		
			System.out.println();
		
		}
		
		
	}

}
