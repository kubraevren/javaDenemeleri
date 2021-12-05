package baslangic;

import java.security.PublicKey;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class AnaSinif {

	public static void main(String[] args) {
		
int a = 15, b = 4;
		
		double c = 1;
		
		int sonucInteger = a/b;
		
		double sonucDouble = a/b;
		
		double sonucDoubleWithC = (c*a)/b;
		
		int sonucIntegerWithC = (int)(c*a)/b;
		
		double sonucDoubleWithDoubleCasting = (double) a/b;
		
		System.out.println("Integer Sonuc: " + sonucInteger);
		
		System.out.println("Double Sonuc: " + sonucDouble);
		
		System.out.println("Double Sonuc With Double Casting: " + sonucDoubleWithDoubleCasting);
		
		System.out.println("Double c degeri: " + c);
		
		System.out.println("Double Sonuc With C: " + sonucDoubleWithC);
		
		System.out.println("Integer Sonuc With C: " + sonucIntegerWithC);
		
	}

}
