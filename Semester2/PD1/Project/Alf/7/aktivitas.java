import java.util.Scanner;

public class aktivitas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int i, j, ordo1, ordo2;

		ordo1 = 5;
		ordo2 = 3;


		int[][] A = new int[ordo1][ordo2];



		System.out.print("Input Matrix A : ");
		for (i = 0;i < 5;i++) {
			for (j = 0;j < 3;j++) {
				
				A[i][j] = sc.nextInt();

			}
			System.out.println();
		}

		
		

	}
	
}