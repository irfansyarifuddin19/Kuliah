public class latihaan {
	public static void main(String[] args){
		//deklarasi variabel
		double panjang = 25;
		double lebar = 10;
		double jumlah;
		double kurang;
		double kali;
		double bagi;
		double modulus;
		//proses operasi
		jumlah = panjang + lebar; //operasi penjumlahan
		kurang = panjang - lebar; //operasi pengurangan
		kali = panjang * lebar; //operasi perkalian
		bagi = panjang / lebar; //operasi pembagian
		modulus = panjang % lebar; //operasi modulus
		//mencetak hasil
		System.out.println ("Hasil Penjumlahan  : "+jumlah );
		System.out.println ("Hasil Pengurangan  : "+kurang );
		System.out.println ("Hasil Perkalian  : "+kali );
		System.out.println ("Hasil Pembagian  : "+bagi );
		System.out.println ("Hasil Modulus  : "+modulus );
	}
}