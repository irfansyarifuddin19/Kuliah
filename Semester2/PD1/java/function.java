import java.util.Scanner;

public class function {
 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		System.out.print("First : ");
		a = sc.nextInt();
		System.out.print("Mid : ");
		b = sc.nextInt();
		System.out.print("Last : ");
		c = sc.nextInt();

		System.out.print("All :" + a + " " + b + " " + c);
		System.out.println();


		asdasd(a, b, c);
		System.out.println(qweqwe(a,b,c));

	}
	

	static void asdasd(int aa, int bb, int cc) {

		System.out.println("Add : " + (aa + bb + cc));

	}

	static int qweqwe(int aa, int bb, int cc) {

		int xx = aa + bb + cc;
		return xx;

	}

}