import java.util.Arrays;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {

		char jawab;

		do {
			{
				Scanner in = new Scanner(System.in);
				System.out.print("Masukkan Kalimat :");
				String palindrome = in.nextLine();
				char[] array = palindrome.toCharArray();
				int ukuran = array.length;
				char[] asli = Arrays.copyOf(array,array.length);

				for (int i=0; i < ukuran / 2; i++) {
					char ubah = array[i];
					array[i] = array[ukuran-i-1];
					array[ukuran-i-1] = ubah;
				}

				System.out.println("---------------------------------------");

				System.out.println("Kalimat aslinya : " + Arrays.toString(asli));
				System.out.println("Kebalikan kalimatnya : " + Arrays.toString(array));

				System.out.println("---------------------------------------");

				if (Arrays.equals(array, asli)) {

					System.out.println("Kalimat tersebut 'palindrome'");

				} else {

					System.out.println("Kalimat tersebut 'bukan polindrome'");

				}
				
				System.out.println("---------------------------------------");
				
				System.out.print("Ulang program ? (y/n) : ");
				jawab = in.next().charAt(0);

			}
		} while (jawab == 'y' || jawab == 'Y');
	
	}
}