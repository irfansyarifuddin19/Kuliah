public class aktifitas2 {

	public static void main(String[] args) {
		
		int n = 10;
		int c = 0;
		int x;

		System.out.println(c);
		System.out.println(n);
		do {

			x = n + c;
			System.out.println(x);

			c = n;
			n = x;
		
		} while (n <= 30);

	}
	
}