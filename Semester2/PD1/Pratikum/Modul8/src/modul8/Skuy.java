/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul8;
import java.util.*;
/**
 *
 * @author Irfan
 */
public class Skuy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Masukkan Angka: ");
        int a=sc.nextInt();
        System.out.print("Masukkan Pangkat: ");
        int b=sc.nextInt();
        
        double hasil;
        hasil = Math.pow(a, b);
        System.out.println(hasil);
                
        }
    
}
