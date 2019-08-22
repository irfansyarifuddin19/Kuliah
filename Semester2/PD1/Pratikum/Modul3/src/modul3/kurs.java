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

public class kurs {
    public static void main(String[] args){

                        System.out.println("==================================================");
			System.out.println("1.Kurs Dollar Ke Rupiah");
			System.out.println("2.Kurs Rupiah Ke Dollar");
                        
                        Scanner input = new Scanner(System.in);
                         int pilihan= input.nextInt();
                         if (pilihan==1)
                         {
                             System.out.println("USD Ke Rupiah");
                             double r;
                             System.out.println("masukkan nilai dollar");
                             double d= input.nextDouble();
                             r= d*14000;
                             System.out.println("USD dalam rupiah: "+r+"");
                         }
                         else if(pilihan==2)
                         {
                             System.out.println("Rupiah Ke USD");
                             double d;
                             System.out.println("masukkan nilai Rupiah");
                             double r= input.nextDouble();
                             d= r/13771;
                             System.out.println("USD dalam rupiah: "+d+"");
                         }

                         
}
    
}
