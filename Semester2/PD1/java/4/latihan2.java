public class latihan2 {

	public static void main(String[] args) {
		
		int a = 10;

		for (int b = 1; b <= 5; b++) {
			
			for (int c = 1; c <= b; c++) {
				
				System.out.print(a + " ");

			}

			a += b * 10;
			System.out.println();

		}

	}

}