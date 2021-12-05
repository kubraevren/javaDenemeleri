package oporetorler;
import java.util.Scanner;

public class calisma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1. sayýyý giriniz:");
		int sayi1 = input.nextInt();
		
		System.out.println("2. sayýyý giriniz:");
		int sayi2 = input.nextInt();
		
		
		 if (sayi1 != sayi2) 
			System.out.println(sayi1 + "!= " + sayi2 ); 
		   if (sayi1 < sayi2) 
			System.out.println(sayi1 + " < " + sayi2 ); 

	    
		   if (sayi1 == sayi2) 
			System.out.println(sayi1 + "== " + sayi2 ); 
			
		   if (sayi1 >= sayi2) 
				System.out.println(sayi1 + ">= " + sayi2 ); 

	}

}
