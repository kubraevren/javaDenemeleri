package denemee;
import java.util.Scanner;
public class denemeeeeee1 {

	public static void main(String[] args) {
	
		int toplam = 0;
		int sayac = 1;
		while (sayac <= 10) {
		Scanner input= new Scanner(System.in);
		System.out.print("not deðerini giriniz:");
		int notDegeri = input.nextInt();
		toplam = toplam+notDegeri;
		sayac = sayac+1; }
	
	int ortalama = toplam/10;
	System.out.println(toplam);
	System.out.println(ortalama);

	}

}
