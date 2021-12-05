package notlar;
import java.util.Scanner;
public class notDegerleri {

	public static void main(String[] args) { // not deðerlerine göre harf yazdýrma
		Scanner input = new Scanner(System.in);
		System.out.println("not giriniz:");
		int OgrenciNotu = input.nextInt();
		
		if (OgrenciNotu >= 90 && OgrenciNotu <=100 ) { // 90-100 arasýnda ise A aldýðýný yazdýk.
			System.out.println("A aldýnýz"); }
		
        else if (OgrenciNotu>= 80)
			 { System.out.println("B aldýnýz");}  // 80-90 arasýnda ise B aldýðýný yazdýk. 
		
        else if (OgrenciNotu>= 70)
		 { System.out.println("C aldýnýz"); }  // 70-80 arasýnda ise C aldýðýný yazdýk.
		
        else if (OgrenciNotu>= 60) {
	System.out.println("D aldýnýz"); }  // 60-70 arasýnda ise D aldýðýný yazdýk.
		
        else if (OgrenciNotu >= 50){
	System.out.println("E aldýnýz"); }  // 50-60 arasýnda ise E aldýðýný yazdýk.
		
		else {
			System.out.println("F aldýnýz."); }  // 50'den küçükse F aldýðýný yazdýk.
	}}
	


