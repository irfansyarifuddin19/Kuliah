import java.util.Scanner;

public class responsi1_3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("inputan : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n ; j++) {

				if ((i == j) | (i+j == n+1)){

					System.out.print("*");

				} else {

					System.out.print(" ");

				}

			}
			System.out.println();
		}

	}

}