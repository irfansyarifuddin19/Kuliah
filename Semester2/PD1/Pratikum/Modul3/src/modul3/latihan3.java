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
public class latihan3 {
    public static void main (String[] args){
        byte a;
        int b;
        float c;
        double d;
        char e ;
        //char=
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Nilai Byte: ");
        a = input.nextByte();
        System.out.println("Nilai Byte: "+a);
        
        System.out.println("Masukkan Nilai Integer: ");
        b = input.nextInt();
        System.out.println("Nilai Integer: "+b);
        
        System.out.println("Masukkan Nilai float: ");
        c = input.nextFloat();
        System.out.println("Nilai Float: "+c);
        
        System.out.println("masukkan Nilai Double :");
        d = input.nextDouble();
        System.out.println("Nilai Double :"+d);
        
        System.out.println("Masukkan Character");
        e = input.next().charAt(0);
        System.out.println("Char:"+e);        
                        
    }
}
