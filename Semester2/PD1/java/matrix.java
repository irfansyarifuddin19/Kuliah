import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int i, j, x, ordo;

		System.out.println("-------------------------------------------");
		System.out.println("  Program Perkalian & Penjumlahan Matrix");
		System.out.println("\n               Alfian Azis");
		System.out.println("-------------------------------------------");
		System.out.print("\n Masukkan jumlah ordo : ");
		ordo = sc.nextInt();
		System.out.println("\n-------------------------------------------");



		int[][] A = new int[ordo][ordo];
		int[][] B = new int[ordo][ordo];
		int[][] C = new int[ordo][ordo];


		System.out.print("Input Matrix A : ");
		for (i = 0;i < ordo;i++) {
			for (j = 0;j < ordo;j++) {
				
				A[i][j] = sc.nextInt();

			}
			System.out.print("\t\t ");
		}

		System.out.print("\nInput Matrix B : ");
		for (i = 0;i < ordo;i++) {
			for (j = 0;j < ordo;j++) {
				
				B[i][j] = sc.nextInt(); 

			}
			System.out.print("\t\t ");
		}


		System.out.println("\n-------------------------------------------");
		System.out.println("\nPilihan : 1. Perkalian");
		System.out.println("\t  2. Penjumlahan\n");
		System.out.print("Pilih salah satu : ");
		int pilih = sc.nextInt();
		System.out.println("-------------------------------------------");


		if (pilih == 1) {
			
			System.out.println("\nHasil: ");

			for (i = 0;i < ordo;i++) {
				for (j = 0;j < ordo;j++) {
					
					C[i][j] = 0;
					for (x = 0;x < ordo;x++) {
						
						C[i][j] = C[i][j] + A[i][x] * B[x][j];

					}
					System.out.print(C[i][j] + " ");

				}
				System.out.println();
			}

		} else if (pilih == 2) {

			System.out.println("\nHasil: ");

			for (i = 0;i < ordo;i++) {
				for (j = 0;j < ordo;j++) {
					
					C[i][j] = 0;
					C[i][j] = C[i][j] + A[i][j] + B[i][j];
					System.out.print(C[i][j] + " ");

				}
				System.out.println();
			}

		} else {

			System.out.println("Inputan Salah.\n\n");

		}

		

	}
	
}