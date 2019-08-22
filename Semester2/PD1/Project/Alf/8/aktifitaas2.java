import java.util.Scanner;

public class aktifitaas2 {

	public static void main(String[] args) {
		
		System.out.print("Angka faktorial: ");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		faktorial(n);

	}

	static void faktorial(int nn) {

		int hitungan, faktor = 1;

		for ( hitungan = 1; hitungan <= nn; hitungan++) {
			
			faktor = faktor * hitungan;

		}

		System.out.println("Hasil faktorial "+ nn +" adalah " + faktor);

	}
	
}