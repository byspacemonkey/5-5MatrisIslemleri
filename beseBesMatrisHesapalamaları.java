package beseBesMatris;

import java.util.Scanner;

public class beseBesMatrisHesapalamalarý {

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
			int satýrtop = 0;
			gecicibuyuk = 0;
			
			for (int j = 0; j < 5; j++) {
				
				System.out.println("lütfen A dizisinin " + i + "-" + j + " indisli elemeanýný girin" );
				dizi[i][j] = k.nextInt();
				toplam += dizi[i][j];
				satýrtop += dizi[i][j];
				
				
				if(gecicibuyuk < dizi[i][j])
					gecicibuyuk=dizi[i][j];
				

				
				if(dizi [i][j] > enBuyuk) {
					enBuyuk= dizi[i][j];
					maxa = i;
					maxb = j;
				}
			}
			satirbuyuk[i] = gecicibuyuk;
			 satirtoplam[i] = satýrtop;
			 
		}
		int ortalama = toplam/25;
		
		for (int f = 0; f < 10; f++) {
			
		System.out.println("Aþþaðýdaki iþlemlerden hanisini yapmak istersiniz: ");
		
		System.out.println("1-) dizinin en büyük deðerli elemanýný göster");
		System.out.println("2-) dizinin en büyük elemanýnýn indislerini göster");
		System.out.println("3-) dizinin elemanýnlarý toplamýný göster");
		System.out.println("4-) dizinin ortalamasýný göster");
		System.out.println("5-) dizinin satýrlarý toplamýný göster");
		System.out.println("6-) dizinin sustunlarý toplamýný göster");
		System.out.println("7-) dizinin satýrlarýndaki en büyük deðerleri göster");
		
		int cikti = k.nextInt();
		
		if (cikti==1)
			System.out.println("A dizisinin en büyük deðeri: " + enBuyuk);
		else if(cikti==2)
			System.out.println("A dizisinin en büyük deðerinin indisleri sýraýyla: " + maxa + "-" + maxb);
		else if(cikti==3)
			System.out.println("A dizisinin elemanlarý toplamý: " + toplam);
		else if(cikti==4)
			System.out.println("A dizisinin ortlamasý: " + ortalama);
		else if(cikti==5) {
			for (int i = 0; i < 5; i++) 
				System.out.println(i + "'inci satýr elemanlarý toplamý: " + satirtoplam[i]);
		}
		else if(cikti==6) {
			for (int i = 0; i < 5; i++) {
				cep = 0;
				for (int j = 0; j < 5; j++) {
					cep += dizi[j][i];
				}
				System.out.println(i + "'inci sutun elemanlarý toplamý: " + cep);
			}
		}
		else if(cikti==7) {
			for (int i = 0; i < 5; i++) 
				System.out.println(i + "'inci satýrýn en büyük elemaný: " + satirbuyuk[i]);
		}else
			System.out.println("Yanlýþ veri girdiniz..");
		}

		}
		
		
		
		
	}


