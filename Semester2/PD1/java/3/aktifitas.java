import java.util.Scanner;

public class aktifitas {
	
	public static void main (String[] args) {

		System.out.println("--------------------------------");
		System.out.println("1. Persegi");
		System.out.println("2. Persegi Panjang");
		System.out.println("3. Segitiga Sama Sisi");
		System.out.println("4. Segitiga Siku-siku");
		System.out.println("5. Lingkaran");
		System.out.println("--------------------------------");

		Scanner sc = new Scanner(System.in);

		System.out.print("> ");
		int chooseone = sc.nextInt();

		if (chooseone == 1) {

			System.out.println("\nRumus: sisi x sisi");
			System.out.print("Masukkan Nilai s(sisi): ");
			int s = sc.nextInt();
			int luas = s * s;
			System.out.println("Luas Persegi: " + luas +"\n");

		} else if (chooseone == 2) {

			System.out.println("\nRumus: panjang x lebar");
			System.out.print("Masukkan Nilai panjang: ");
			int p = sc.nextInt();
			System.out.print("Masukkan Nilai lebar: ");
			int l = sc.nextInt();
			int luas = p * l;
			System.out.println("Luas Persegi Panjang: " + luas +"\n");

		} else if (chooseone == 3) {

			System.out.println("\nRumus: 1/2 x alas x tinggi");
			System.out.print("Masukkan Nilai alas: ");
			double a = sc.nextDouble();
			System.out.print("Masukkan Nilai tinggi: ");
			double t = sc.nextDouble();
			double luas = 0.5 * a * t;
			System.out.println("Luas Segitiga Sama Sisi: " + luas +"\n");

		} else if (chooseone == 4) {

			System.out.println("\nRumus: 1/2 alas x tinggi");
			System.out.print("Masukkan Nilai alas: ");
			double a = sc.nextDouble();
			System.out.print("Masukkan Nilai tinggi: ");
			double t = sc.nextDouble();
			double luas = 0.5 * a * t;
			System.out.println("Luas Segitiga Siku-siku: " + luas +"\n");
	
		} else if (chooseone == 5) {

			System.out.println("\nRumus: phi x r x r");
			System.out.print("Masukkan Nilai r: ");
			double r = sc.nextInt();
			double luas = 22/7 * r * r;
			System.out.println("Luas Lingkaran: " + luas +"\n");
	
		} else {

			System.out.println ("Input tidak benar");

		}

	}

}