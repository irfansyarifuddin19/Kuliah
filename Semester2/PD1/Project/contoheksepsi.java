public class contoheksepsi{
	
	public static void main (String []args){

	int pembilang =2 ;
	int penyebut = 5;
	int hasil;
	
	try{
	 	hasil =pembilang/penyebut;
		System.out.println("hasil= "+hasil);
	}catch (ArithmeticException  e){
		System.out.println("kesalahan "+"terdapat pembagian dengan nol");
	}
	}
}