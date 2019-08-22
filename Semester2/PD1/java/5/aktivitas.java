public class aktivitas {
	
	public static void main(String[] args) {
		
		int a = 0;
		int b1 = 0;
		int	b2 = 10;
		int x;

		for (x = 1; x <= 5; x++) {
			
			if ( x % 2 != 0 ) {
				
				b1 = b1 + 1;
				for (a = b1; a <= b2; a++) {

					System.out.print(a + " ");
				
				}
				System.out.println("");

			} else {

				b1 = a + 9;
				for (a = b1; a > b2; a--) {

					System.out.print(a + " ");
				
				}
				b2 = b1 + 10;
				System.out.println();

			}

		}


	}

}