/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul8;
import java.util.Scanner;
/**
 *
 * @author Irfan
 */
public class Modul8yanglain1 {
    public static void main(String[] args) {
		
		System.out.print("Angka faktorial: ");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		faktorial(n);

	}

	static void faktorial(int nn) {

		int hitungan, faktor = 1;

		for ( hitungan = 1; hitungan <= nn; hitungan++) {
			
			faktor = faktor * hitungan;

		}

		System.out.println("Hasil faktorial "+ nn +" adalah " + faktor);

	}
	
}

