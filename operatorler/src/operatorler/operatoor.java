package operatorler;
import java.util.Scanner;
public class operatoor {

	public static void main(String[] args) { //burda operatörler ile sayýlarý karþýlaþtýrdýk.
		
		Scanner input = new Scanner(System.in); // veri almak için kullandýk.
		System.out.println("1. sayýyý giriniz:"); // kullanýcýdan karþýlaþtýrma için kullanýlacak 1. sayýyý istedik
		int sayi1 = input.nextInt(); // sayi1 deðiþkenine atadýk ve int deðerine dönüþtürdük.
		
		System.out.println("2. sayýyý giriniz:"); // kullanýcýdan 2. sayýyý istedik.
		int sayi2 = input.nextInt(); // sayi2 deðiþkenine atadýk ve int deðerine dönüþtürdük.
		
		
		 if (sayi1 != sayi2)  // eþit deðil operatörüyle sayýlarý karþýlaþtýracaðýz. eðer sayýlar eþit deðilse
			System.out.println(sayi1 + "!= " + sayi2 );  // ekrana sayýlarý yazýp != (eþit deðil) yazacak 
		   
		 if (sayi1 < sayi2)  // sayi1 sayi2'den küçükse 
			System.out.println(sayi1 + " < " + sayi2 ); // ekrana sayýlarý yazýp < (küçüktür) yazacak

	    
		   if (sayi1 == sayi2) // sayýlar eþitse eðer 
			System.out.println(sayi1 + "== " + sayi2 ); // sayýlarý yazýp eþit olduðunu belirtecek.
			
		   if (sayi1 >= sayi2) // sayý1 sayý2'den büyük ve eþitse koþul saðlanacak
				System.out.println(sayi1 + ">= " + sayi2 ); // sayýlarý yazýp büyük eþittir diyerek karþýlaþtýrmayý yapacak.

	}

}
