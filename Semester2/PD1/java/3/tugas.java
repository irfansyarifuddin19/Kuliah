import java.util.Scanner;

public class tugas {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		double harga, jumlah, diskon, uang, total, total_diskon, kembalian;

		System.out.println("\nkntl-shop");
		System.out.println("--------------------------");

		System.out.print("Harga barang: ");
		 harga = sc.nextDouble();

		System.out.print("Jumlah \t: ");
		 jumlah = sc.nextDouble();

		System.out.print("Diskon \t: ");
		 diskon = sc.nextDouble();

		System.out.print("Bayar \t: ");
		 uang = sc.nextDouble();

		System.out.println("--------------------------");

		total_diskon = harga * jumlah * ( diskon/100 );
		total = harga * jumlah - total_diskon; 


		if (uang >= total) {
			
			kembalian = uang - total;
			System.out.println("Total harga: "+ total);
			System.out.println("Kembalian: "+ kembalian +"\n");
		
		} else {

			System.out.println("Uang kurang pan8");			

		}

	}
	
}