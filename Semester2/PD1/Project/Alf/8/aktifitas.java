import java.util.Scanner;

public class aktifitas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String nrp1 = sc.nextLine();
		String nama1 = sc.nextLine();
		String kelas1 = sc.nextLine();

		asede(nrp1, nama1, kelas1);

	}

	static void asede(String nrp, String nama, String kelas) {

		System.out.println("NRP   : " + nrp);
		System.out.println("Nama  : " + nama);
		System.out.println("Kelas : " + kelas);

	}
	
	
}