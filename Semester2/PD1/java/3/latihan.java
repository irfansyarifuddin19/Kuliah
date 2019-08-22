import java.util.Scanner;


public class latihan {

	public static void main(String[] args) {

		System.out.println("--------------------------------");
		System.out.println("1. Byte");
		System.out.println("2. Integer");
		System.out.println("3. Float");
		System.out.println("4. Double");
		System.out.println("5. Character");
		System.out.println("--------------------------------");

		Scanner sc = new Scanner(System.in);

		System.out.print("> ");
		int chooseone = sc.nextInt();

		if (chooseone == 1) {

			System.out.print("\nMasukkan nilai Byte: ");
			byte b = sc.nextByte();
			System.out.println("Byte: " + b +"\n");

		} else if (chooseone == 2) {

			System.out.print("\nMasukkan nilai Integer: ");
			int i = sc.nextInt();
			System.out.println("Integer: " + i +"\n");

		} else if (chooseone == 3) {

			System.out.print("\nMasukkan nilai Float: ");
			float f = sc.nextFloat();
			System.out.println("Float: " + f +"\n");

		} else if (chooseone == 4) {

			System.out.print("\nMasukkan nilai Double: ");
			double d = sc.nextDouble();
			System.out.println("Double: " + d +"\n");
	
		} else if (chooseone == 5) {

			System.out.print("\nMasukkan nilai Character: ");
			char c = sc.next().charAt(1);
			System.out.println("Char: " + c +"\n");
	
		} else {

			System.out.println ("Input tidak benar");

		}
		
	}

}