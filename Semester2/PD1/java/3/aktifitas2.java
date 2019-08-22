import java.util.Scanner;

public class aktifitas2 {

	public static void main(String[] args) {

		System.out.println("\nPerhitungan \t1. dollar to rupiah");
		System.out.print("\t\t2. rupiah to dollar \n > ");

		float kurs = 13698;

		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();

		if (choose == 1) {

			System.out.print("Masukkan nominal uang: ");
			float dollar = sc.nextFloat();

			float rupiah = dollar * kurs;
			System.out.println("Rupiah: " + rupiah + "\n");

		} else if (choose == 2) {

			System.out.print("Masukkan nominal uang: ");
			float rupiah = sc.nextFloat();

			float dollar = rupiah / kurs;
			System.out.println("Dollar: " + dollar + "\n");

		} else {

			System.out.println("pilihan tidak benar");

		}

	}

}