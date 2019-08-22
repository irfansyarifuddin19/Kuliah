/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;
import java.util.*;
/**
 *
 * @author Irfan
 */
public class Barang extends Customer{
    public static void bara() {
        
    
    
    int kodeBrg =0;
    String namaBrg;
    float harga =0;
    
      Scanner sc=new Scanner (System.in);
        System.out.print("Kode Barang: "); 
        kodeBrg = sc.nextInt();
        System.out.println("Masukkan Nama barang : ");
        namaBrg = sc.next();
        System.out.println("Masukkan Harga");
        harga = sc.nextFloat();
         
   
}
}