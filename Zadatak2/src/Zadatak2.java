import java.util.Scanner;
public class Zadatak2 {
	
	public static void main(String[] args) {
		int a, b, c, brojPozitivnih = 0;
		Scanner u = new Scanner(System.in);
		System.out.println("Unsei a: ");
		a = u.nextInt();
		System.out.println("Unsei b: ");
		b = u.nextInt();
		System.out.println("Unsei c: ");
		c = u.nextInt();
		// Odredjivanje broja poz. brojeva
		if (a >= 0) brojPozitivnih++;
		if (b >= 0) brojPozitivnih++;
		if (c >= 0) brojPozitivnih++;
		// Ispis rezultata
		System.out.printf("Uneseno je %d pozitivna broja i %d negativna.", brojPozitivnih, 3-brojPozitivnih);
	}

}
