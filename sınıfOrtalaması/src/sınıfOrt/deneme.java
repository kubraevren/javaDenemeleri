package s�n�fOrt;
import java.util.Scanner;
public class deneme {

	public static void main(String[] args) { // 10 ki�inin not ortalamas�n� hesaplayan uygulama yapt�k
		int toplam = 0; // toplam� 0'a e�itledik ��nk� gelen de�erleri �st �ste ekleyece�iz.0 toplamada etkisiz elemand�r.
		int sayac = 1; // saya�� 1'e e�itledik ki kullan�c�dan tam olarak 10 say� alal�m,0'a e�itleseydik 11 say� al�nacakt�.
		while (sayac <= 10) { // d�ng� 10 kere �al��acak o y�zden b�yle bir ko�ul koyduk. 
		Scanner input= new Scanner(System.in);  // kullan�c�dan veri almak i�in bunu kulland�k.
		System.out.print("not de�erini giriniz:"); // verimizi ald�k.
		int notDegeri = input.nextInt(); // veriyi integer de�erine �evirip notDegeri de�i�kenine atad�k.
		toplam = toplam+notDegeri; // veriler eklendik�e toplam de�i�keni artacak
		sayac = sayac+1; } // d�ng�n�n 10 kere �al��t���n� bulmak i�in her d�ng�de saya�'� 1 art�r�r�z.
	
	int ortalama = toplam/10;  // ortalamay� bulmak i�in toplam de�eri 10'a b�leriz.
	System.out.println(toplam); // toplam� yazd�r�r�z.
	System.out.println(ortalama); // ortalamay� yazd�r�r�z.

	}

}
