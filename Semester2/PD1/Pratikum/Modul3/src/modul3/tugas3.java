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
public class tugas3 {
    public static void main(String[] args) {
        System.out.println("Selamat datang di toko saia");
        System.out.println("Toko bagus menyediakan baju polos");
        
        Scanner input =new Scanner (System.in);
        
        {
        System.out.print("Jumlah baju yang akan dibeli? ");
        double baju = 50000 ;
        double diskon = 0.5; 
        double jumlah = input.nextDouble();
        System.out.print("Masukkan Nominal Uang anda ");
        double bayar = input.nextDouble();
        double total = baju*jumlah*diskon;
        double kembalian = bayar-total;
        
            System.out.println("anda harus membayar "+ total);
            
        if (bayar>total)
        {
            System.out.println("uang kembalian anda "+ kembalian);
        }
        else 
        {
            System.out.println("maaf uang anda kurang");
        }
    }
}
}
