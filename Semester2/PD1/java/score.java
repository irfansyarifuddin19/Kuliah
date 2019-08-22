import java.util.Scanner;

public class score {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Masukkan nilai : ");
		int input = sc.nextInt();

		if (input == 100) {
			
			System.out.println("EXCELLENT");

		} else {

			if (input >= 56) {

				System.out.println("LULUS");

			} else {

				if (input == 0) {
					
					System.out.println("CUPUH ABIS");

				} else {

					if (input < 56) {
						
						System.out.println("GRAGAL");

					}

				}

			}

		}

	}

}