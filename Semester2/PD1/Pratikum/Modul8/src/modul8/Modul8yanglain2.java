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
public class Modul8yanglain2 {
 static int showFak(int n) {

		if (n == 1){
			
			return 1;
	
		} else {

			return( n * showFak(n-1) );

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Angka : ");
		int angkaFak = sc.nextInt();

		System.out.println("Hasil Faktorial dari angka "+angkaFak+" adalah " + showFak(angkaFak));

	}
	
}   

