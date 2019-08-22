
import java.util.Scanner;

public class aktivitas2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int i, j, ordo1, ordo2;

		ordo1 = 3;
		ordo2 = 4;


		int[][] A = new int[ordo1][ordo2];



		System.out.print("Input Matrix A : ");
		for (i = 0;i < ordo1;i++) {
			for (j = 0;j < ordo2;j++) {
				
				A[i][j] = sc.nextInt();

			}
			System.out.println();
		}

		
		

	}
	
}
