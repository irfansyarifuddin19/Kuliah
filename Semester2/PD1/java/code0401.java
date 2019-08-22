import java.util.Scanner;


public class code0401 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nMasukkan nilai Byte: ");
		byte b = sc.nextByte();
		System.out.println("Byte: " + b +"\n");

		System.out.print("\nMasukkan nilai Integer: ");
		int i = sc.nextInt();
		System.out.println("Integer: " + i +"\n");

		System.out.print("\nMasukkan nilai Float: ");
		float f = sc.nextFloat();
		System.out.println("Float: " + f +"\n");

		System.out.print("\nMasukkan nilai Double: ");
		double d = sc.nextDouble();
		System.out.println("Double: " + d +"\n");

		System.out.print("\nMasukkan nilai Character: ");
		char c = sc.next().charAt(0);
		System.out.println("Char: " + c +"\n");
		
	}

}