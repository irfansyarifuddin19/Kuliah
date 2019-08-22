import java.util.Scanner;

public class matriksrobet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int i, j, x;
		int a = 3;

		int[][] A = new int[a][a];
		int[][] B = new int[a][a];
		int[][] C = new int[a][a];

		System.out.println("Program menghitung matriks 3 x 3");

		System.out.println("Matriks A : ");
		for (i = 0;i < a;i++) {
			for (j = 0;j < a;j++) {
				
				A[i][j] = sc.nextInt();

			}
		}

		System.out.println("\nMatriks B : ");
		for (i = 0;i < a;i++) {
			for (j = 0;j < a;j++) {
				
				B[i][j] = sc.nextInt(); 

			}
		}


		System.out.println("1. Perkalian");
		System.out.println("2. Penjumlahan");
		System.out.print("> ");
		int asd = sc.nextInt();
		

		if (asd == 1) {
			
			System.out.println();
			System.out.println("Hasil: ");

			for (i = 0;i < a;i++) {
				for (j = 0;j < a;j++) {
					
					C[i][j] = 0;
					for (x = 0;x < a;x++) {
						
						C[i][j] = C[i][j] + A[i][x] * B[x][j];

					}
					System.out.print(C[i][j] + " ");

				}
				System.out.println();
			}

		} else if (asd == 2) {

			System.out.println();
			System.out.println("Hasil: ");

			for (i = 0;i < a;i++) {
				for (j = 0;j < a;j++) {
					
					C[i][j] = 0;
					C[i][j] = C[i][j] + A[i][j] + B[i][j];
					System.out.print(C[i][j] + " ");

				}
				System.out.println();
			}

		} else {

			System.out.println("Salah.");

		}

		

	}
	
}