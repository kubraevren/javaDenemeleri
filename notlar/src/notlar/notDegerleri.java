package notlar;
import java.util.Scanner;
public class notDegerleri {

	public static void main(String[] args) { // not de�erlerine g�re harf yazd�rma
		Scanner input = new Scanner(System.in);
		System.out.println("not giriniz:");
		int OgrenciNotu = input.nextInt();
		
		if (OgrenciNotu >= 90 && OgrenciNotu <=100 ) { // 90-100 aras�nda ise A ald���n� yazd�k.
			System.out.println("A ald�n�z"); }
		
        else if (OgrenciNotu>= 80)
			 { System.out.println("B ald�n�z");}  // 80-90 aras�nda ise B ald���n� yazd�k. 
		
        else if (OgrenciNotu>= 70)
		 { System.out.println("C ald�n�z"); }  // 70-80 aras�nda ise C ald���n� yazd�k.
		
        else if (OgrenciNotu>= 60) {
	System.out.println("D ald�n�z"); }  // 60-70 aras�nda ise D ald���n� yazd�k.
		
        else if (OgrenciNotu >= 50){
	System.out.println("E ald�n�z"); }  // 50-60 aras�nda ise E ald���n� yazd�k.
		
		else {
			System.out.println("F ald�n�z."); }  // 50'den k���kse F ald���n� yazd�k.
	}}
	


