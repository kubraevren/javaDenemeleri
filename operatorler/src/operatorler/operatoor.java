package operatorler;
import java.util.Scanner;
public class operatoor {

	public static void main(String[] args) { //burda operat�rler ile say�lar� kar��la�t�rd�k.
		
		Scanner input = new Scanner(System.in); // veri almak i�in kulland�k.
		System.out.println("1. say�y� giriniz:"); // kullan�c�dan kar��la�t�rma i�in kullan�lacak 1. say�y� istedik
		int sayi1 = input.nextInt(); // sayi1 de�i�kenine atad�k ve int de�erine d�n��t�rd�k.
		
		System.out.println("2. say�y� giriniz:"); // kullan�c�dan 2. say�y� istedik.
		int sayi2 = input.nextInt(); // sayi2 de�i�kenine atad�k ve int de�erine d�n��t�rd�k.
		
		
		 if (sayi1 != sayi2)  // e�it de�il operat�r�yle say�lar� kar��la�t�raca��z. e�er say�lar e�it de�ilse
			System.out.println(sayi1 + "!= " + sayi2 );  // ekrana say�lar� yaz�p != (e�it de�il) yazacak 
		   
		 if (sayi1 < sayi2)  // sayi1 sayi2'den k���kse 
			System.out.println(sayi1 + " < " + sayi2 ); // ekrana say�lar� yaz�p < (k���kt�r) yazacak

	    
		   if (sayi1 == sayi2) // say�lar e�itse e�er 
			System.out.println(sayi1 + "== " + sayi2 ); // say�lar� yaz�p e�it oldu�unu belirtecek.
			
		   if (sayi1 >= sayi2) // say�1 say�2'den b�y�k ve e�itse ko�ul sa�lanacak
				System.out.println(sayi1 + ">= " + sayi2 ); // say�lar� yaz�p b�y�k e�ittir diyerek kar��la�t�rmay� yapacak.

	}

}
