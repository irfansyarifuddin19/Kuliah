
import java.util.Scanner;

public class inputscanner{
	public static void main(String[] args){

			String nama, alamat;
			int tunjangan = 0;

			Scanner sc= new Scanner (System.in);
		
		System.out.println("Silahkan masukan nama: ");
		nama = sc.next ();

		System.out.println("Silahkan masukan alamat: ");
		alamat = sc.next ();

		System.out.println("Silahkan masukan tunjangan: ");
		tunjangan= sc.nextInt ();

		System.out.println("Nama anda adalah "+nama+" Alamat anda "+alamat+" Tunjangan anda "+tunjangan);

	}
}