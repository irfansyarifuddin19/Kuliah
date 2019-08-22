public class kabisat{
		public static void main (String[] args){

		int tahun;
		for(tahun=1000; tahun<=2018; tahun++)
			if(tahun % 400 == 0){
				System.out.println(tahun);
			}
			else if (tahun % 4 == 0){
				System.out.println(tahun);
			}
		}
}