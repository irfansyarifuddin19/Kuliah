/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

/**
 *
 * @author Irfan
 */
import java.util.Scanner;

public class bangundatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
			System.out.println("==================================================");
			System.out.println("1.Persegi");
			System.out.println("2.Persegi Panjang");
			System.out.println("3.Segitiga sama sisi");
			System.out.println("4.Segitiga siku-siku");
			System.out.println("5.lingkaran");
			System.out.println("==================================================");		

			Scanner input = new Scanner(System.in);
			int pilihan = input.nextInt();
			if (pilihan ==1)
			{
				System.out.println("Rumus : s x s");
				int a;
				System.out.println("Masukkan Nilai S :");
				int s = input.nextInt();
				a = s*s;
				System.out.println("Luas Persegi :"+a+"");
			}
			else if(pilihan == 2)
			{
				System.out.println("rumus: PxL");
				int v=0;
				System.out.print("masukkan Panjang : ");
				int panjang = input.nextInt();
				System.out.println("masukkan lebar : ");
				int lebar =input.nextInt();
				v = panjang*lebar;
				System.out.println("Luas Persegi Panjang: "+v+"");

			}
			else if(pilihan ==3)
			{
				System.out.println("Rumus :1/2*alas*tinggi");
				double l;
				System.out.print("Masukkan alas : ");
				double la =input.nextDouble();
				System.out.print("Masukkan tinggi : ");
				double T = input.nextDouble();
				l = 0.5*la*T ;
				System.out.println("Luas Segitiga sama sisi : " +l+"");

			}
			else if (pilihan==4)
			{
				System.out.println("rumus : 1/2*alas*tinggi");
				double tab;
				System.out.print("Masukkan alas: ");
				double jari=input.nextDouble();
				System.out.print("masukkan nilai tinggi: ");
				double Ti=input.nextDouble();
				tab =0.5*jari*Ti;
				System.out.println("Luas Segitiga Siku-siku: "+tab+"");
			}
			else if (pilihan ==5)
			{
				System.out.println("Rumus : 22/7*r*r");
				double ker;
				System.out.println("masukkan jari-jari : ");
				double jar = input.nextDouble();
				ker=22/7*jar*jar;
				System.out.println("luas lingkaran: "+ker+"");

			}
	
    }
    
}