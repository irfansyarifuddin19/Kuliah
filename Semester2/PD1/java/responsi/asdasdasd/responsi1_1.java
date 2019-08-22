import java.util.Scanner;

public class responsi1_1 {

	public static void main(String[] args) {

		// BASA-BASI

		Scanner	sc = new Scanner(System.in);

		System.out.println("|------------------------|");
		System.out.println("|-------Judi Dadu--------|");
		System.out.println("|------------------------|");
		System.out.println("Akan di kocok 2 buah dadu.");
		System.out.println("Tebak jumlah dadu tersebut. \n");

		System.out.print("Masukkan tebakan anda (2-12): ");
		int tebakan = sc.nextInt();

		// Ngolah inputan

		if (tebakan >= 2 && tebakan <= 12) {
			
			// DADU !!!!!!!!!!!!
			int dadu1, dadu2, jumlahdadu;

			dadu1 = (int) (Math.random() * 6) + 1;
			dadu2 = (int) (Math.random() * 6) + 1;

			jumlahdadu = dadu1 + dadu2;


			System.out.println("-----------");
			System.out.println("Dadu 1: " + dadu1);
			System.out.println("Dadu 2: " + dadu2);
			System.out.println("-----------");


			if (tebakan == jumlahdadu) {
				
				System.out.println("Cocok");

			} else {

				System.out.println("Salah");

			}


		} else {

			System.out.println("Inputan tidak valid");

		}
		
	}
	
}