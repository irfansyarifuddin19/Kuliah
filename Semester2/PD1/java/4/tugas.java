public class tugas {

	public static void main(String[] args) {
		
		int a, b;
		for ( a = 1 ; a <= 50 ; a++ ) {
			int c = 0;
			for ( b = 2 ; b <= a ; b++ ) {
				
				if (a % b == 0) {
					
					if (a != b) {
						c = 1;
					}
					if (c != 1 && a == b) {
						System.out.println(a);
					}

				}

			}
		}

	}
	
}