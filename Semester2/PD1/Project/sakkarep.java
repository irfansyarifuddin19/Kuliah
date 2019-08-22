public class sakkarep {
	public static void main(String[] args){
	int buku1 = 5;
	int spidol1 = 2;
	int total1 = 26000;

	int buku2 = 3;
	int spidol2 = 4;
	int total2 = 38000;

	int buku1_buku2 = buku1*buku2;
	int spidol1_buku2 = spidol1*buku2;
	int total1_buku2 = total1*buku2;

	int buku2_buku1 = buku2*buku1;
	int spidol2_buku1 = spidol2*buku1;
	int total2_buku1 = total2*buku1;

	System.out.println(buku1_buku2+"b + "+spidol1_buku2+"s = "+total1_buku2);
	System.out.println(buku2_buku1+"b + "+spidol2_buku1+"s = "+total2_buku1);

	System.out.println("-----------------------");
	
	int harga_spidol = (total1_buku2-total2_buku1)/(spidol1_buku2-spidol2_buku1);
	System.out.println((spidol1_buku2-spidol2_buku1)+"s = "+(total1_buku2-total2_buku1));

	int harga_buku = (total1+(-1*(spidol1*harga_spidol)))/buku1;
	


	System.out.println("s : "+harga_spidol);
	System.out.println("b : "+harga_buku);
	}
}