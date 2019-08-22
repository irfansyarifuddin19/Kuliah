import java.util.Scanner;

public class score2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Masukkan nilai : ");
		int input = sc.nextInt();

		if (input >= 56) {
			
			if (input == 100) {
				
				System.out.println("JAGO");

			} else {

				System.out.println("LULUS");

			}

		} else {

			if (input == 0) {
			
				System.out.println("CUPUH");

			} else {

				System.out.println("GAGAL");

			}

		}

	}

}