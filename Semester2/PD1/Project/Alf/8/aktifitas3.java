import java.util.Scanner;

public class aktifitas3 {

	static int showFak(int n) {

		if (n == 1){
			
			return 1;
	
		} else {

			return( n * showFak(n-1) );

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Angka : ");
		int angkaFak = sc.nextInt();

		System.out.println("Hasil Faktorial dari angka "+angkaFak+" adalah " + showFak(angkaFak));

	}
	
}