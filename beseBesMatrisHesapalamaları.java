package beseBesMatris;

import java.util.Scanner;

public class beseBesMatrisHesapalamalar� {

	public static void main(String[] args) {
		
		int[][] dizi= new int[5][5];
		int [] satirtoplam = new int [5];
		int [] satirbuyuk = new int [5];
		
		Scanner k= new Scanner(System.in);
		
		int enBuyuk = 0;
		int maxa = 0;
		int maxb = 0;
		int toplam = 0;
		int cep = 0;
		int gecicibuyuk = 0;
		
		
		for (int i = 0; i < 5; i++) {
			int sat�rtop = 0;
			gecicibuyuk = 0;
			
			for (int j = 0; j < 5; j++) {
				
				System.out.println("l�tfen A dizisinin " + i + "-" + j + " indisli elemean�n� girin" );
				dizi[i][j] = k.nextInt();
				toplam += dizi[i][j];
				sat�rtop += dizi[i][j];
				
				
				if(gecicibuyuk < dizi[i][j])
					gecicibuyuk=dizi[i][j];
				

				
				if(dizi [i][j] > enBuyuk) {
					enBuyuk= dizi[i][j];
					maxa = i;
					maxb = j;
				}
			}
			satirbuyuk[i] = gecicibuyuk;
			 satirtoplam[i] = sat�rtop;
			 
		}
		int ortalama = toplam/25;
		
		for (int f = 0; f < 10; f++) {
			
		System.out.println("A��a��daki i�lemlerden hanisini yapmak istersiniz: ");
		
		System.out.println("1-) dizinin en b�y�k de�erli eleman�n� g�ster");
		System.out.println("2-) dizinin en b�y�k eleman�n�n indislerini g�ster");
		System.out.println("3-) dizinin eleman�nlar� toplam�n� g�ster");
		System.out.println("4-) dizinin ortalamas�n� g�ster");
		System.out.println("5-) dizinin sat�rlar� toplam�n� g�ster");
		System.out.println("6-) dizinin sustunlar� toplam�n� g�ster");
		System.out.println("7-) dizinin sat�rlar�ndaki en b�y�k de�erleri g�ster");
		
		int cikti = k.nextInt();
		
		if (cikti==1)
			System.out.println("A dizisinin en b�y�k de�eri: " + enBuyuk);
		else if(cikti==2)
			System.out.println("A dizisinin en b�y�k de�erinin indisleri s�ra�yla: " + maxa + "-" + maxb);
		else if(cikti==3)
			System.out.println("A dizisinin elemanlar� toplam�: " + toplam);
		else if(cikti==4)
			System.out.println("A dizisinin ortlamas�: " + ortalama);
		else if(cikti==5) {
			for (int i = 0; i < 5; i++) 
				System.out.println(i + "'inci sat�r elemanlar� toplam�: " + satirtoplam[i]);
		}
		else if(cikti==6) {
			for (int i = 0; i < 5; i++) {
				cep = 0;
				for (int j = 0; j < 5; j++) {
					cep += dizi[j][i];
				}
				System.out.println(i + "'inci sutun elemanlar� toplam�: " + cep);
			}
		}
		else if(cikti==7) {
			for (int i = 0; i < 5; i++) 
				System.out.println(i + "'inci sat�r�n en b�y�k eleman�: " + satirbuyuk[i]);
		}else
			System.out.println("Yanl�� veri girdiniz..");
		}

		}
		
		
		
		
	}


