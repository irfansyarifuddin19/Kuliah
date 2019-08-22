import java.util.Scanner;

public class responsi1_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("hari : ");
		int hari = sc.nextInt();
		System.out.print("bulan : ");
		int bulan = sc.nextInt();
		System.out.print("tahun : ");
		int tahun = sc.nextInt();

		int tglmax;

		if (bulan == 1) {
			tglmax = 31;
		} else if (bulan == 2) {
			tglmax = 29;
		} else if (bulan == 3) {
			tglmax = 31;
		} else if (bulan == 4) {
			tglmax = 30;
		} else if (bulan == 5) {
			tglmax = 29;
		} else if (bulan == 6) {
			tglmax = 31;
		} else if (bulan == 7) {
			tglmax = 30;
		} else if (bulan == 8) {
			tglmax = 29;
		} else if (bulan == 9) {
			tglmax = 31;
		} else if (bulan == 10) {
			tglmax = 30;
		} else if (bulan == 11) {
			tglmax = 29;
		} else  {
			tglmax = 31;
		}

		hari++;
		if (hari > tglmax) {
			
			hari = 1;
			bulan++;
			if (bulan > 12) {
				
				bulan = 1;
				tahun++;
			}

		} else if ( bulan > 12 ){

			System.out.println("Bulan Tidak Valid");

		}

		System.out.println(hari+"/"+bulan+"/"+tahun);

	}
	
}