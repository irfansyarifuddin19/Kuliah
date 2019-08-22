import java.util.Scanner;

public class aktivitas3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("x : ");
		int x = sc.nextInt();

		System.out.print("y : ");
		int y = sc.nextInt();

		int hasil = 1;
		for (int a = 1;a <= y; a++) {
			hasil = hasil * x;
		}
		System.out.println(hasil);

	}
	
}