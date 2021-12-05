package sýnýfOrt;
import java.util.Scanner;
public class deneme {

	public static void main(String[] args) { // 10 kiþinin not ortalamasýný hesaplayan uygulama yaptýk
		int toplam = 0; // toplamý 0'a eþitledik çünkü gelen deðerleri üst üste ekleyeceðiz.0 toplamada etkisiz elemandýr.
		int sayac = 1; // sayaçý 1'e eþitledik ki kullanýcýdan tam olarak 10 sayý alalým,0'a eþitleseydik 11 sayý alýnacaktý.
		while (sayac <= 10) { // döngü 10 kere çalýþacak o yüzden böyle bir koþul koyduk. 
		Scanner input= new Scanner(System.in);  // kullanýcýdan veri almak için bunu kullandýk.
		System.out.print("not deðerini giriniz:"); // verimizi aldýk.
		int notDegeri = input.nextInt(); // veriyi integer deðerine çevirip notDegeri deðiþkenine atadýk.
		toplam = toplam+notDegeri; // veriler eklendikçe toplam deðiþkeni artacak
		sayac = sayac+1; } // döngünün 10 kere çalýþtýðýný bulmak için her döngüde sayaç'ý 1 artýrýrýz.
	
	int ortalama = toplam/10;  // ortalamayý bulmak için toplam deðeri 10'a böleriz.
	System.out.println(toplam); // toplamý yazdýrýrýz.
	System.out.println(ortalama); // ortalamayý yazdýrýrýz.

	}

}
